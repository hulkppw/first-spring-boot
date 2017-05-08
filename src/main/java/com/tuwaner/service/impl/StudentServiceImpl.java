package com.tuwaner.service.impl;

import com.tuwaner.dao.StudentDao;
import com.tuwaner.domain.Student;
import com.tuwaner.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    public List<Student> findAllStudent(){
        return studentDao.findAllStudent();
    }

    public Student findStudentByStuId(String stuId) {
        return studentDao.findByStuId(stuId);
    }

}
