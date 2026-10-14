package com.project.portal.service;

import com.project.portal.dao.StudentDao;
import com.project.portal.model.Student;

import java.util.List;

public class StudentService {

    private StudentDao studentDao = new StudentDao();

    public void addStudent(Student student){
        studentDao.addStudent(student);
    }

    public void updateStudent(Student student){
        studentDao.updateStudent(student);
    }

    public void deleteStudent(int id){
        studentDao.deleteStudent(id);
    }

    public Student getStudentById(int id){
        return studentDao.getStudentById(id);
    }

    public List<Student> getAllStudent(){
        return studentDao.getAllStudent();
    }


}
