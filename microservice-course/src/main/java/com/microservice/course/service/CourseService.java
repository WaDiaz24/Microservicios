package com.microservice.course.service;

import com.microservice.course.http.response.StudentByCourseResponse;
import com.microservice.course.model.Course;

import java.util.List;

public interface CourseService {

    Course getCourseDetails(Long courseId);

    String enrollStudentInCourse(String courseId, String studentId);

    List<Course> getAllCourses();

    Course addNewCourse(Course course);

    StudentByCourseResponse getStudentsByCourseId(Long courseId);
}
