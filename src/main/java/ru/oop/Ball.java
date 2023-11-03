package ru.oop;

public class Ball {
    public void tryRun(boolean condition) {
        if (condition) {
            System.out.println("Колобок съеден");
        } else if (!condition) {
            System.out.println("Колобок убежал");
        }

    }
}
