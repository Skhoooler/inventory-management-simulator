package com.sklr.invMgmtSim;

public abstract class Item {
    protected String name;
    protected float price;
    protected boolean claimed;
    protected int hungerSaturation;
    protected int numOfUses;
    protected float efficiency;

    public Item(){
        name = "no name";
        price = 0;
        claimed = false;
        hungerSaturation = 0;
        numOfUses = 0;
        efficiency = 0;
    }

   /* public Item(String newName, float newPrice){
        name = newName;
        price = newPrice;
        claimed = false;
    }*/


    /**
     * Efficiency is the measure of how much bang for your buck you
     * get out of an item. The formula to measure efficiency is:
     *         (hungerSaturation * numOfUses)
     *         ------------------------------ = efficiency
     *                      price
     */
    protected void setEfficiency(){
        efficiency = (hungerSaturation * numOfUses)/price;
    }

    public float getEfficiency(){ return efficiency; }


    public int getHungerSaturation() {
        return hungerSaturation;
    }

    public void setHungerSaturation(int hungerSaturation) {
        this.hungerSaturation = hungerSaturation;
    }

    public int getNumOfUses() {
        return numOfUses;
    }

    public void setNumOfUses(int numOfUses) {
        this.numOfUses = numOfUses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isClaimed() {
        return claimed;
    }

    public void setClaimed(boolean claimed) {
        this.claimed = claimed;
    }
}
