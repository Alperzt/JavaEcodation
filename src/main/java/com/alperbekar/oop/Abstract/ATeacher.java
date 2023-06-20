package com.alperbekar.oop.Abstract;

public class ATeacher extends APerson {
    @Override
    public String toString() {
        return "Teacher{} " + super.toString();
    }
    @Override
    public void FullName(){
        System.out.println("Teacher fullname :" + this.getName().concat(" ").concat(this.getSurname()));
    }
}
