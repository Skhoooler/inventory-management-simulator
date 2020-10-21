package com.sklr.invMgmtSim;

import java.util.ArrayList;
import java.util.HashMap;


public class Stock {
    private HashMap<Item, ArrayList<Item>> items;

    Stock(){
        items = new HashMap<Item, ArrayList<Item>>();
    }

    public void addItem(Item item){
        verifyData(item);
        items.get(item).add(item);
        System.out.println("Item " + item.getName() + " added.");
    }

    public boolean removeItem(Item item){
        if (verifyStock(item)){
            items.get(item).remove(item);
            System.out.println("Item \"" + item.getName() + "\" removed");
            return true;
        }
        else
            return false;
    }

    /**
     * Verifies that the item is actually in stock
     * @param item item to be searched for
     * @return true if the item is in stock, false if not
     */
    private boolean verifyStock(Item item){
        if (items.get(item.getClass()).isEmpty())
            return false;
        else{
            //System.out.println("Item \"" + item.getName() + "\" is out of stock");
            return true;
        }

    }

    /**
     * Verifies that the specific item has an arrayList for its kind
     * inside the items arraylist. If not, then it will create one
     * @param item the item to be put into the arraylist
     */
    private void verifyData(Item item){
        if (items.containsKey(item))
            return;

        // If the Map contains the required arrayList, then it shouldn't
        // make it to this point
        items.put(item, new ArrayList<Item>());
    }

    public HashMap<Item, ArrayList<Item>> getItems() {
        return items;
    }
}
