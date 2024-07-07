package com.ucan.blockchain.models;

import com.ucan.blockchain.models.Transaction;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class Block {
    //HEADER
    private int index;
    private Date timestamp;
    private String previousHash;
    private String currentHash;
    private int difficulty;
    private long nonce;
    private int limitTransaction;
    //BODY
    private ArrayList<Transaction> transactions;

    public Block() {
        this.transactions = new ArrayList<>();
    }

    public boolean addTransaction(Transaction transaction) {
        if (this.transactions.size() <= 10)
            return this.transactions.add(transaction);
        return false;
    }

    //I need to check the block before add to the blockchain


}
