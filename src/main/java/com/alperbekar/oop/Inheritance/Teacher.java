package com.alperbekar.oop.Inheritance;

public class Teacher extends Person {
    @Override
    public String toString() {
        return "Teacher{} " + super.toString();
    }
    @Override
    public void FullName() {
        System.out.println("Teacher name : " + this.getName().concat(" ").concat(getSurname()));
    }
}
