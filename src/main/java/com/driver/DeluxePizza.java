package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(boolean isVeg) {
        super(isVeg);
        this.addExtraCheese();
        this.addExtraToppings();
    }
}
