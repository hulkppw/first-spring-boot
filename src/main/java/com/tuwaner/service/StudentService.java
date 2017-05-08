package com.tuwaner.service;

import com.tuwaner.domain.Student;

import java.util.List;


public interface StudentService {
    /**
     *
     * @return
     */
    List<Student> findAllStudent();

    /**
     *
     * @param stuId
     * @return
     */
    Student findStudentByStuId(String stuId);

}
