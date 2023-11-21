package ru.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return x - y;
    }

    public int divide(int y) {
        return y / x;
    }

    public int sumAllOperation(int s) {
        return sum(s) + minus(s) + divide(s) + multiply(s);
    }

    public int multiply(int y) {
        return x * y;
    }

    public static void main(String[] args) {
        int a = Calculator.sum(5);
        System.out.println(a);
        int b = Calculator.minus(6);
        System.out.println(b);
        Calculator calculator = new Calculator();
        int c = calculator.divide(7);
        System.out.println(c);
        int d = calculator.multiply(8);
        System.out.println(d);
        int f = calculator.sumAllOperation(5);
        System.out.println(f);


    }
}