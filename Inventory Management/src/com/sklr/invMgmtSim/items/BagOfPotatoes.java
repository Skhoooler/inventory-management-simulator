package com.sklr.invMgmtSim.items;

import com.sklr.invMgmtSim.Item;

public class BagOfPotatoes extends Item {
    public BagOfPotatoes(){
        name = "Bag of Potatoes";
        price = 4.5f;
        claimed = false;
        hungerSaturation = 3;
        numOfUses = 4;
        // default efficiency of 2.6
        setEfficiency();
    }

    public BagOfPotatoes(float newPrice){
        name = "Bag of Potatoes";
        price = newPrice;
        claimed = false;
        hungerSaturation = 3;
        numOfUses = 4;
        setEfficiency();
    }
}
