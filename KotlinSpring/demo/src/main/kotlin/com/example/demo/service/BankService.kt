package com.example.demo.service

import com.example.demo.datasource.BankDataSource
import com.example.demo.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService(private val dataSource:BankDataSource) {

    fun getBanks():Collection<Bank> = dataSource.reteriveBanks()

    fun getBank(accountNumber:String):Bank=dataSource.reteriveBank(accountNumber)

    fun addBank(bank:Bank):Bank=dataSource.createBank(bank)

    fun updateBank(bank: Bank): Bank = dataSource.updateBank(bank)

    fun deleteBank(accountNumber: String) :Unit = dataSource.deleteBank(accountNumber)



}