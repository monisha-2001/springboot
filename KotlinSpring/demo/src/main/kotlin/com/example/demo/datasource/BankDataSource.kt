package com.example.demo.datasource

import com.example.demo.model.Bank

interface BankDataSource {

    fun reteriveBanks():Collection<Bank>

    fun reteriveBank(accountNumber:String):Bank

    fun createBank(bank: Bank): Bank

    fun updateBank(bank: Bank): Bank

    fun deleteBank(accountNumber: String)
}