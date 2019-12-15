package com.Mesfer.com.Mesfer.demo;



import java.util.List;

public interface StudentService {

    List<Student> listAll();

    Student getById(Long id);

    Student saveOrUpdate(Student student);

    void delete(Long id);

    Student saveOrUpdateStudentForm(StudentForm studentForm);


}
