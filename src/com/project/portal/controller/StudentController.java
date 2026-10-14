package com.project.portal.controller;

import com.project.portal.model.Student;
import com.project.portal.service.StudentService;

import java.util.List;

public class StudentController {

    private StudentService  studentService = new StudentService();

    public void addStudent(Student student){
        studentService.addStudent(student);
    }

    public void updateStudent(Student student){
        studentService.updateStudent(student);
    }

    public void deleteStudent(int id){
        studentService.deleteStudent(id);
    }

    public Student getStudentById(int id){
        return studentService.getStudentById(id);
    }

    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

}
