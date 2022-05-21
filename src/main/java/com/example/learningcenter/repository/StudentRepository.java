package com.example.learningcenter.repository;

import com.example.learningcenter.entity.Student;
import com.example.learningcenter.entity.Teacher;
import com.example.learningcenter.repository.base.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long>, BaseRepository {

    Boolean existsByPhone(String phone);

    Boolean existsByPhoneAndIdNot(String phone, Long id);

}
