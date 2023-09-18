package com.ofss.util;

public class CashRegister {
    private int cashOnHand;

    public CashRegister() {
        cashOnHand = 0;
    }

    public CashRegister(int initialCash) {
        cashOnHand = initialCash;
    }

    public int getCurrentBalance() {
        return cashOnHand;
    }

    public void acceptAmount(int amount) {
    	
        cashOnHand += amount;
//        System.out.println("Amount = " +amount);
    }
    public int remainingBal(int cost) {
//    	System.out.println("On Hand = " +cashOnHand);
    	cashOnHand = cashOnHand -cost;
//    	System.out.println(cashOnHand);
//    	System.out.println(cost);
    	return cashOnHand;
    	
    }
}
