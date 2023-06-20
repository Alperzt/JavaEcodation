package com.alperbekar.oop.Inheritance;

import lombok.NoArgsConstructor;

import java.util.Date;
@NoArgsConstructor
public class Student extends Person {
private String specialStudent;

    public Student(Long id, String name, String surname, Date createddate, String specialStudent) {
        super(id, name, surname, createddate);
        this.specialStudent = specialStudent;
    }

    public Student(Long id, String name, String surname, Date createddate) {
        super(id, name, surname, createddate);
    }

    @Override
    public String toString() {
        return "Student{" +
                "specialStudent='" + specialStudent + '\'' +
                "} " + super.toString();
    }

    @Override
    public void FullName() {
        System.out.println("Student name : " + this.getName().concat(" ").concat(getSurname()));
    }
}
