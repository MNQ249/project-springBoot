package com.Mesfer.com.Mesfer.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class StudentController {
    private StudentService studentService;


    @Autowired
    public void setStudentService(StudentService studentService){this.studentService = studentService;}

    @RequestMapping("/")
    public String redirToList() {return "redirect:/student/list";}

    @RequestMapping({"/student/list", "/student"})
    public String listStudents(Model model){
        model.addAttribute("student", studentService.getById(Long.valueOf(id)));
        return "student/list";
    }

    @RequestMapping("student/show/{id}")
    public String getStudent(@PathVariable String id, Model model){
        model.addAttribute("student", studentService.getById(Long.valueOf(id)));
        return "student/show";
    }

    @RequestMapping("student/edit/{id}")
    public String edit(@PathVariable String id, Model model){
        Student student = studentService.getById(Long.valueOf(id));
        StudentForm studentForm = studentFormToStudent.convert(student);

        model.addAttribute("studentForm", studentForm);
        return "student/studentForm";

    }

    @RequestMapping("/student/new")
    public String newStudent(Model model){
        model.addAttribute("studentForm", new StudentForm());
        return "student/studentform";
    }

    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public String saveOrUpdateStudent(@Valid StudentForm studentForm, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "student/studentform";
        }
        Student saveStudent = studentService.saveOrUpdateStudentForm(studentForm);
        return  "redirect:/student/show/" + saveStudent.getId();
    }

    @RequestMapping("/student/delete/{id}")
    public String delete(@PathVariable String id){
        studentService.delete(Long.valueOf(id));
        return "redirect:/student/list";
    }




}
