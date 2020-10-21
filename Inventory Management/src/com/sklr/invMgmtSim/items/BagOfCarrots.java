package com.sklr.invMgmtSim.items;

import com.sklr.invMgmtSim.Item;

public class BagOfCarrots extends Item {
    public BagOfCarrots(){
        name = "Bag of Carrots";
        price = 3f;
        claimed = false;
        hungerSaturation = 2;
        numOfUses = 3;
        // default efficiency of 2
        setEfficiency();
    }

    public BagOfCarrots(float newPrice){
        name = "Bag of Carrots";
        price = newPrice;
        claimed = false;
        hungerSaturation = 2;
        numOfUses = 3;
        setEfficiency();
    }
}
