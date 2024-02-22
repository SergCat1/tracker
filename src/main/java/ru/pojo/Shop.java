package ru.pojo;

public class Shop {
    public static int indexOfNull(Product[] prodcut) {
        for (int i = 0; i < prodcut.length; i++) {
            if (prodcut[i] == null) {
                return i;
            }
        }
        return -1;
    }
}
