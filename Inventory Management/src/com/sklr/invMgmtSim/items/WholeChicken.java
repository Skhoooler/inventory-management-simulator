package com.sklr.invMgmtSim.items;

import com.sklr.invMgmtSim.Item;

public class WholeChicken extends Item {
    public WholeChicken(){
        name = "Whole Chicken";
        price = 8.5f;
        claimed = false;
        hungerSaturation = 5;
        numOfUses = 6;
        // default efficiency of ~3.5
        setEfficiency();
    }

    public WholeChicken(float newPrice){
        name = "Whole Chicken";
        price = newPrice;
        claimed = false;
        hungerSaturation = 5;
        numOfUses = 6;
        setEfficiency();
    }
}
