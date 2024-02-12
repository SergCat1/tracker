package ru.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setFullname("Жемчугов Иван Иванович");
        student.setAdmissiondate(new Date());
        student.setGroup("\"Джава разработчик\"");
        System.out.println(student.getFullname() + " состоит в группе " + student.getGroup() + " и начал обучение со следующей датой:  " + student.getAdmissiondate());
    }
}
