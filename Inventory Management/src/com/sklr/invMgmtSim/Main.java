package com.sklr.invMgmtSim;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean endLoop = false;
        Store store = new Store(100);
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("The store will start with 100$");

        store.buy(ItemTypes.Potatoes, 5);
        store.buy(ItemTypes.Carrots, 5);

        do{
            store.displayStock();
            System.out.println("What would you like to do?");
            System.out.println("B: Buy Something");
            System.out.println("L: leave");

            String userResponse = inputScanner.nextLine();

            if (userResponse.equals("L") || userResponse.equals("l")){
                endLoop = true;
            }
            else if (userResponse.equals("B") || userResponse.equals("b")){
                store.sell(ItemTypes.Carrots, 2);
            }
        }while(!endLoop);
    }
}