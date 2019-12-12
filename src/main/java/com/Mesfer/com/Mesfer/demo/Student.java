package com.Mesfer.com.Mesfer.demo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity // this tells Hibernate to make a table out the class
@Table
@Setter
@Getter
public class Student {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private Integer age;

    @Column
    private Integer gpa;


}
