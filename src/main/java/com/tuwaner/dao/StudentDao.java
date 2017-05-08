package com.tuwaner.dao;

import com.tuwaner.domain.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by wanglingyun on 2017/5/8.
 */
public interface StudentDao {
    /**
     *
     * @return
     */
    List<Student> findAllStudent();

    /**
     * @param stuId
     * @return
     */
    Student findByStuId(@Param("stuId") String stuId);

}
