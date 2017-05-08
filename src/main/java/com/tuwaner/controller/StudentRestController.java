package com.tuwaner.controller;

import com.tuwaner.domain.Student;
import com.tuwaner.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentRestController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/student/{stuId}", method = RequestMethod.GET)
    public Student findStudentByStuId(@PathVariable("stuId") String stuId) {
        return studentService.findStudentByStuId(stuId);
    }

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public List<Student> findAllStudent() {
        return studentService.findAllStudent();
    }

}
