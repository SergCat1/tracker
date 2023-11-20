package ru.oop;

public class Battery {

    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public String about() {
        return "My charge: " + load + "%";
    }

    public void exchange(Battery another) {
        this.load = this.load + another.load;
        another.load = this.load;
        this.load = 0;

    }

    public static void main(String[] args) {
        Battery first = new Battery(10);
        Battery second = new Battery(5);
        System.out.println("first : " + first.about());
        System.out.println("second : "  + second.about());
        first.exchange(second);
    }
}