package com.zplus.student.dao;

import com.zplus.student.model.StudentMaster;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao extends CrudRepository<StudentMaster,Integer> {

}
