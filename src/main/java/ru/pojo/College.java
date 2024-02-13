package ru.pojo;

import java.time.LocalDate;


public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setFullname("Жемчугов Иван Иванович");
        student.setAdmissiondate(LocalDate.now());
        student.setGroup("\"Джава разработчик\"");
        System.out.println(student.getFullname() + " состоит в группе " + student.getGroup() + " и начал обучение со следующей датой:  " + student.getAdmissiondate());
    }
}
