package ru.inheritance;

public class Programmer extends Engineer {
    private String programLang;

    public Programmer(String programLang, int experience, boolean degree) {
        super(1, true);
        this.programLang = programLang;
    }
}