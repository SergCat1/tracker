package ru.cast;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Поезд ездит со скоростью света");
    }
}
