package ru.poly;

public class Bus implements  Transport {
    @Override
    public void move() {
        System.out.println("Старт движения");
    }

    @Override
    public void passanger(int number) {
        System.out.println("Автобус везет " + number + " пассажиров");
    }

    @Override
    public double fuel(double fuel_number) {
        return fuel_number * 50.39;
    }
}
