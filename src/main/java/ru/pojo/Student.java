package ru.pojo;

import java.time.LocalDate;


public class Student {

    private String fullname;
    private String group;
    private LocalDate admissiondate;

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public LocalDate getAdmissiondate() {
        return admissiondate;
    }

    public void setAdmissiondate(LocalDate admissiondate) {
        this.admissiondate = admissiondate;
    }
}
