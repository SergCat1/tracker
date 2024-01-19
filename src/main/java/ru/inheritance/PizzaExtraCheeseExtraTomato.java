package ru.inheritance;

public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese {

    private static String tomato = " + Extra tomato";

    public String name() {

        return super.name() + tomato;

    }
}
