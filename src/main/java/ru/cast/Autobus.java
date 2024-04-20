package ru.cast;

public class Autobus implements Vehicle {
    @Override
    public void move() {
        System.out.println("Автобус ездит со скоростью 350 км/ч");
    }
}
