package com.Mesfer.com.Mesfer.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {


    private StudentRepository studentRepository;
    private StudentFormToStudent studentFormToStudent;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository)
    {this.studentRepository=studentRepository;
    this.studentFormToStudent=studentFormToStudent;
    }



    @Override
    public List<Student> listAll() {
        List<Student> students = new ArrayList<>();
        studentRepository.findAll().forEach(students :: add);
        return students;
    }

    @Override
    public Student getById(Long id) {
        return studentRepository.findOne(id);
    }

    @Override
    public Student saveOrUpdate(Student student) {
        studentRepository.save(student);
        return student;
    }

    @Override
    public void delete(Long id) {
        studentRepository.delete(id);

    }


    @Override
    public Student saveOrUpdateStudentForm(StudentForm studentForm){
        Student saveStudent = saveOrUpdate(studentFormToStudent.convert(studentForm));

        System.out.println("save student id:" + saveStudent.getId());
        return saveStudent;
    }


}
