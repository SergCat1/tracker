package ru.cast;

public class Usage {
    public static void main(String[] args) {
        Vehicle airplane = new Airplane();
        Vehicle autobus = new Autobus();
        Vehicle train = new Train();
        Vehicle[] vehicle = new Vehicle[]{airplane, autobus, train};
        for (Vehicle a : vehicle) {
            a.move();
        }
    }
}
