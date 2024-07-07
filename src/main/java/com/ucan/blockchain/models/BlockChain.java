package com.ucan.blockchain.models;

import com.ucan.blockchain.models.Block;
import lombok.Getter;

import java.util.ArrayList;

@Getter
public class BlockChain {
    private final ArrayList<Block> blockchain;

    public BlockChain() {
        this.blockchain = new ArrayList<>();
    }

    public void addBlock(Block block) {
        this.blockchain.add(block);
    }

}
