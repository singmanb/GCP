package com.example.application;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class applications {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private int id;
private String name;

public applications () {

}
public applications (String name) {
    this.name = name;
}

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "applications{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
