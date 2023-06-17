package com.driver;

public class Pizza {

    private int price;
    private boolean isVeg;
    private boolean extraCheeseAdded;
    private boolean toppingsAdded;
    private boolean takeawayAdded;
    private String bill;

    public Pizza(boolean isVeg){
        this.isVeg = isVeg;
        this.extraCheeseAdded = false;
        this.toppingsAdded = false;
        this.takeawayAdded = false;
        this.price = isVeg ? 300 : 400;
        this.bill = "";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if (!extraCheeseAdded) {
            extraCheeseAdded = true;
            this.price += 80;
            this.bill += "Extra Cheese Added: 80\n";
        }
    }

    public void addExtraToppings(){
        if (!toppingsAdded) {
            toppingsAdded = true;
            int toppingsPrice = isVeg ? 70 : 120;
            this.price += toppingsPrice;
            this.bill += "Extra Toppings Added: " + toppingsPrice + "\n";
        }
    }

    public void addTakeaway(){
        if (!takeawayAdded) {
            takeawayAdded = true;
            this.price += 20;
            this.bill += "Paperbag Added: 20\n";
        }
    }

    public String getBill(){
        this.bill = "Base Price Of The Pizza: " + this.price + "\n" + this.bill + "Total Price: " + this.price + "\n";
        return this.bill;
    }
}
