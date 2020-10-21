package com.sklr.invMgmtSim;

import java.util.ArrayList;
import java.lang.Math;

public class Person {
    private float money;
    private int hunger;
    private ArrayList<Item> inventory;
    private float inventoryTotalHungerSaturation;

    Person(){
        money = 10f;
        hunger = 20;
        inventoryTotalHungerSaturation = 0;
    }

    Person(float newMoney){
        money = newMoney;
        hunger = 20;
        inventoryTotalHungerSaturation = 0;
    }

    /**
     * Handles eating. If the person has something in their inventory, they
     * eat it. If not, they get hungrier.
     */
    public void eat(){
        if (!inventory.isEmpty()) {
            hunger += inventory.get(0).hungerSaturation;
            inventoryTotalHungerSaturation -= inventory.get(0).hungerSaturation;
            inventory.remove(0);
            inventory.trimToSize();
        }
        else
        {
            hunger -= 2;
        }
    }


    public void buy(Store store){
        float budget = money * getPercentWillingToSpend();
        float moneySpent = 0;

        while (moneySpent < budget){
                        
        }
    }


    private float getPercentWillingToSpend(){
        verifyHunger();

        // This is a formula I came up with

        // Percent willing to spend = .01 (100 - 50 ln(.37 * hunger))

        // This gives a good curve where the closer hunger is to 0,
        // the more that person is willing to spend.
        return (float) (.01 * (100 - (50 * Math.log(.37 * hunger))));
    }

    private void verifyHunger(){
        if (hunger < 0)
            hunger = 0;

        if (hunger > 20)
            hunger = 20;
    }
}
