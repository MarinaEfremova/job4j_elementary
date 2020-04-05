package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Marina");
        student.setSurname("Efremova");
        student.setGroup("a-0603");
        student.setReceiptDate(new Date());

        System.out.println("Student - " + student.getSurname() + " " + student.getName() + " from group " + student.getGroup() + ", date receipt " + student.getReceiptDate());
    }
}
