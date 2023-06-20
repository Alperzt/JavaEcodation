package com.alperbekar.oop.Abstract;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
 abstract public class APerson {
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
    abstract public void FullName();
}

