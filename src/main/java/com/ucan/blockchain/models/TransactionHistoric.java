package com.ucan.blockchain.models;

import com.ucan.blockchain.models.Transaction;

import java.util.ArrayList;

public class TransactionHistoric {
    ArrayList<Transaction> transactions;

    public TransactionHistoric() {
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction transaction) {
        this.transactions.add(transaction);
    }

    public void removeTransaction(int id) {
        this.transactions.remove(id);
    }
}
