package com.example.bank

import com.example.bank.controller.model.OverviewTranscationModel
import com.example.bank.controller.model.TranscationModel
import com.example.bank.controller.model.convertToDBModel
import com.example.bank.controller.model.convertToOverviewTranscationModel
import com.example.bank.repository.TransferRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/transfer")
class TransferController(val repository: TransferRepository) {


    @PostMapping("/new")
    fun newTransfer(@RequestBody transcationModel: TranscationModel){
        repository.save(transcationModel.convertToDBModel())
    }

    @GetMapping("all")
    fun getAllTransfers():List<OverviewTranscationModel> {
        return repository.findAll().map{ it.convertToOverviewTranscationModel()}
    }

}