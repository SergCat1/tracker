package ru.pojo;

public class Shop {
    public static int indexOfNull(Product[] p) {
        for (int i = 0; i < p.length; i++) {
            if (p[i] == null) return i;
        }
        return -1;
    }
}
