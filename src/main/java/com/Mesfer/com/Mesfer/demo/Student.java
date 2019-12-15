package com.Mesfer.com.Mesfer.demo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity // this tells Hibernate to make a table out the class
@Table
public class Student {

    @Id
    @GeneratedValue(strategy =GenerationType.SEQUENCE)
    private Integer id;

    @Column
    private String name;

    @Column
    private Integer age;

    @Column
    private Integer gpa;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getGpa() {
        return gpa;
    }

    public void setGpa(Integer gpa) {
        this.gpa = gpa;
    }
}
