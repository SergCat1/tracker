package ru.pojo;

public class Library {
    public static void main(String[] args) {
        Book firstbook = new Book("Java", 100);
        Book secondbook = new Book("Python", 150);
        Book thridbook = new Book("С#", 50);
        Book cleanbook = new Book("CleanCode", 0);
        Book[] book = new Book[4];
        book[0] = firstbook;
        book[1] = secondbook;
        book[2] = thridbook;
        book[3] = cleanbook;
        for (int index = 0; index < book.length; index++) {
            Book pr = book[index];
            System.out.println(pr.getName() + " количество страниц " + pr.getPageCount());
        }
        Book temp = book[0];
        book[0] = book[3];
        book[3] = temp;

        for (int index = 0; index < book.length; index++) {
            Book pr = book[index];
            System.out.println(pr.getName() + " количество страниц " + pr.getPageCount());
        }
        for (int index = 0; index < book.length; index++) {
            Book pr = book[index];
            if ("CleanCode".equals(pr.getName())) {
                System.out.println(pr.getName() + " количество страниц " + pr.getPageCount());
            }
        }
    }
}
