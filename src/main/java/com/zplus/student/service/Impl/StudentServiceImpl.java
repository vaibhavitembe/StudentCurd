package com.zplus.student.service.Impl;

import com.zplus.student.dao.StudentDao;
import com.zplus.student.dto.StudentDto;
import com.zplus.student.model.StudentMaster;
import com.zplus.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl  implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public Boolean studentService(StudentDto studentDto) {

        StudentMaster studentMaster=new StudentMaster();

        studentMaster.setStudentName(studentDto.getStudentName());
        studentMaster.setAddress(studentDto.getAddress());
        studentMaster.setMarks(studentDto.getMarks());
       studentMaster.setAge(studentDto.getAge());
        studentMaster.setStatus("Active");

        try{
            studentDao.save(studentMaster);
            return true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }



    }
}
