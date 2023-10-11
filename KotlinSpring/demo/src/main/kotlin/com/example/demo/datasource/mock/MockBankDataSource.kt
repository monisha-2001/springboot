package com.example.demo.datasource.mock

import com.example.demo.datasource.BankDataSource
import com.example.demo.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource{

    val banks= mutableListOf(
        Bank("1234",3.14,100),
        Bank("1010",7.16,0),
        Bank("5678",0.0,17),
    )


    override fun reteriveBanks(): Collection<Bank> =banks

    override fun reteriveBank(accountNumber: String): Bank =
        banks.firstOrNull() { it.accountNumber== accountNumber}
            ?: throw NoSuchElementException("Could not find a bank with account number $accountNumber")

    override fun createBank(bank: Bank): Bank {
        if(banks.any { it.accountNumber==bank.accountNumber }){
            throw IllegalArgumentException("Bank with account number ${bank.accountNumber} already exists")
        }
        banks.add(bank)
        return bank
    }

    override fun updateBank(bank: Bank): Bank {
        val currentBank=banks.firstOrNull{it.accountNumber==bank.accountNumber}
            ?:throw NoSuchElementException("")

        banks.remove(currentBank)
        banks.add(bank)

        return bank

    }

    override fun deleteBank(accountNumber: String) {
        val currentBank=banks.firstOrNull{it.accountNumber==accountNumber}
            ?:throw NoSuchElementException("Could not find the bank with account number $accountNumber")

        banks.remove(currentBank)

    }


}