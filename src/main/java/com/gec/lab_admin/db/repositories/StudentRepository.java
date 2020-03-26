package com.gec.lab_admin.db.repositories;

import com.gec.lab_admin.db.models.Student;
import com.gec.lab_admin.db.models.Teacher;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,String> {

}
