package com.alperbekar.oop.Inheritance;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private Long id;
    private String name;
    private String surname;
    private Date createddate = new Date(System.currentTimeMillis());

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", createddate=" + createddate +
                '}';
    }
    public void FullName(){
        System.out.println(this.name.concat(" ").concat(this.surname));
    }
}

