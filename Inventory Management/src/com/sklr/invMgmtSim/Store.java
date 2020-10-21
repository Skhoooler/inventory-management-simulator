package com.sklr.invMgmtSim;

import com.sklr.invMgmtSim.items.*;

import java.util.ArrayList;
import java.util.Map;

public class Store {
    private float money;
    private Stock stock;

    Store(){
        money = 100f;
        stock = new Stock();
    }

    Store(float startingMoney){
        money = startingMoney;
        stock = new Stock();
    }

    public void displayStock(){
        System.out.println("Items in stock: ");
        for(Map.Entry<Item, ArrayList<Item>> entry: stock.getItems().entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue().size());
        }
    }

    public void sell(ItemTypes itemTypeEnum, int num){
        switch (itemTypeEnum){
            case Potatoes:
                for (int i = 0; i < num; i++){
                    stock.removeItem(new BagOfPotatoes());
                    money += new BagOfCarrots().price;
                }
                break;
            case Carrots:
                for (int i = 0; i < num; i++){
                    if (stock.removeItem(new BagOfCarrots()))
                        money += new BagOfCarrots().price;
                }
                break;
            case Chicken:
                for (int i = 0; i < num; i++){
                    stock.removeItem(new WholeChicken());
                    money += new WholeChicken().price;
                }
                break;
            case Roast:
                for (int i = 0; i < num; i++){
                    stock.removeItem(new BeefRoast());
                    money += new BeefRoast().price;
                }
                break;
        }
        System.out.println("Store Money: " + money);
    }

    public void buy(ItemTypes itemTypeEnum, int num){
        switch (itemTypeEnum){
            case Potatoes:
                for (int i = 0; i < num; i++){
                    stock.addItem(new BagOfPotatoes());
                }
                break;
            case Carrots:
                for (int i = 0; i < num; i++){
                    stock.addItem(new BagOfCarrots());
                }
                break;
            case Chicken:
                for (int i = 0; i < num; i++){
                    stock.addItem(new WholeChicken());
                }
                break;
            case Roast:
                for (int i = 0; i < num; i++){
                    stock.addItem(new BeefRoast());
                }
                break;
        }
    }
}
