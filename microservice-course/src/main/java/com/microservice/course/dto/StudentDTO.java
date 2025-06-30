package com.microservice.course.dto;

import lombok.*;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {
    private String name;
    private String email;
    private String phone;
    private Long courseId;
}
