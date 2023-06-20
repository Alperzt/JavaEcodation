package com.alperbekar.oop;

import com.alperbekar.oop.Abstract.APerson;
import com.alperbekar.oop.Abstract.AStudent;
import com.alperbekar.oop.Inheritance.Person;
import com.alperbekar.oop.Inheritance.Student;
import com.alperbekar.oop.Inheritance.Teacher;

public class Main {
    public static void main(String[] args) {
        Person personInheritance = new Student();
        Person person = new Person();
        person.setId(1L);
        person.setName("1. person adi");
        person.setSurname("1.person soyadi");
        System.out.println(person);
        person.FullName();

        System.out.println("********************");

        Student student= new Student();
        student.setId(2L);
        student.setName("1. ogrenci adi");
        student.setSurname("1. ogrenci soyadi");
        System.out.println(student);
        student.FullName();

        System.out.println("********************");

        Teacher teacher = new Teacher();
        teacher.setId(3L);
        teacher.setName("1. ogretmen adi");
        teacher.setSurname("1. ogretmen soyadi");
        System.out.println(teacher);
        teacher.FullName();

        APerson APerson = new AStudent();
    }

}
