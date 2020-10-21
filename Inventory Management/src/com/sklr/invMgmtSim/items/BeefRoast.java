package com.sklr.invMgmtSim.items;

import com.sklr.invMgmtSim.Item;

public class BeefRoast extends Item {
    public BeefRoast(){
        name = "Beef Roast";
        price = 12f;
        claimed = false;
        hungerSaturation = 6;
        numOfUses = 8;
        // default efficiency of 4
        setEfficiency();
    }

    public BeefRoast(float newPrice){
        name = "Beef Roast";
        price = newPrice;
        claimed = false;
        hungerSaturation = 5;
        numOfUses = 6;
        setEfficiency();
    }
}
