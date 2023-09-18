package com.ofss.main;

import java.util.Scanner;

import com.ofss.util.CashRegister;
import com.ofss.util.Product;



public class VendingMachine {
    public static void showSelection() {
        System.out.println("Welcome to the Candy Machine!");
        System.out.println("1. Candy - Rs 50");
        System.out.println("2. Chips - Rs 75");
        System.out.println("3. Gum - Rs 30");
        System.out.println("4. Cookies - Rs 100");
    }

    public static void sellProduct(Product product, CashRegister register) {
    	if(product.getQuantity()==0) {
    		System.out.println("Sorry, " + product.getName() + " is out of stock.");
            return;
    	}

        System.out.println("You have selected " + product.getName() + ".");
        System.out.println("Cost of " + product.getName() + ": " + product.getCost());

        Scanner scanner = new Scanner(System.in);
        int currentBalance = register.getCurrentBalance();
        while(currentBalance<product.getCost()) {
        		
                int requiredDeposit = product.getCost() - currentBalance;
                System.out.println("Please deposit " + requiredDeposit + " more money.");

                int deposit;           
                	System.out.println("You are Poor!!!!!!! -_-");
                    System.out.print("Deposit money: ");
                    deposit = scanner.nextInt();             

                register.acceptAmount(deposit);
                currentBalance = register.getCurrentBalance();
                

 }

        int remainingBalance = register.getCurrentBalance();
        if (remainingBalance >= product.getCost()) {
            product.makeSale();
            
            
            remainingBalance = register.remainingBal(product.getCost());
            System.out.println("Remaining balance: " + remainingBalance);
            System.out.println("Quantity Remaining " +product.getQuantity());
            System.out.println("Thank you for using Me );");
        }
       
  }
      

    public static void main(String[] args) {
        CashRegister register = new CashRegister();
        Product[] products = {
            new Product("Candy", 50, 50),
            new Product("Chips", 75, 50),
            new Product("Gum", 30, 40),
            new Product("Cookies", 100, 60)
        };
        int count = 0;
        do {

        showSelection();
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice >= 1 && choice <= 4) {
            sellProduct(products[choice-1], register);
            
            
        }
        else {
            System.out.println("Invalid choice. Please select 1-5.");
        }
        System.out.println("Do you want to Continue? (1.yes -2.no)");
        Scanner scanner1 = new Scanner(System.in);
        count = scanner1.nextInt();
    }
   
   while (count==1);
        System.out.println("Thank you for using the Vending Machine!");
        
    } 
}
