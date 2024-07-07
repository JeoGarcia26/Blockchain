package com.ucan.blockchain.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class Transaction {
    private int id;
    private String data;
    private Date timestamp;
    private String sender;
    private String receiver;
    private String signature;

    public Transaction() {
        this.timestamp = new Date();
    }

}

