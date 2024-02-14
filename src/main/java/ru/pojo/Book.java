package ru.pojo;

public class Book {
    private String name;
    private int pagecount;

    public Book(String name, int pagecount) {
        this.name = name;
        this.pagecount = pagecount;

    }

    public String getName() {
        return name;
    }

    public int getPageCount() {
        return pagecount;
    }
}
