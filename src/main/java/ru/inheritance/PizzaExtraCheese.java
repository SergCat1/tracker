package ru.inheritance;
public class PizzaExtraCheese extends Pizza {
    private static String cheese = " + Dorblu";

    public String name() {
        return super.name() + cheese;
    }
}
