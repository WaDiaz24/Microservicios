package com.microservice.students.service;

import com.microservice.students.entity.Student;

import java.util.List;

public interface StudentService {
    Student createStudent(Student student);

    void updateStudent(Long id, Student student);

    void deleteStudent(Long id);

    List<Student> getAllStudents();

    Student getStudentById(Long id);

    List<Student> getStudentsByCourseId(Long courseId);
}
