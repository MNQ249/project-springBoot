package com.Mesfer.com.Mesfer.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


/*
Defining this interface serves two purposes: First, by extending JpaRepository we get a bunch of generic CRUD methods
 into our type that allows saving student, deleting them and so on. Second, this will allow the Spring Data JPA
 repository infrastructure to scan the classpath for this interface and create a Spring bean for it.
 */

public interface StudentRepository extends JpaRepository<Student,Long> {


}
