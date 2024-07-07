package com.ucan.blockchain.models;

import lombok.Getter;

@Getter
public class Node {
    //So, I need to define the functions to the node types
    private final Peer peer;
    private String publicKey;
    private String privateKey;

    private BlockChain ledger;
    private TransactionHistoric pendingTransactions;

    public Node(int port){
        this.peer = new Peer(port);
    }
    public void generatePrivateKey() {
        if (this.privateKey == null) {
            this.privateKey = "new private key";
        }
    }
    public void generatePublicKey() {
        if (this.publicKey == null) {
            this.publicKey = "new public key";
        }
    }
    public void doDigitalSignature(Transaction transaction) {
        if(transaction.getSender().equals(this.publicKey)){
            //Encriptar a transaction
        }

    }

    public void propagateTransaction(Transaction transaction){

    }
    public boolean isValidTransaction(Transaction transaction){

        return true;
    }
}
