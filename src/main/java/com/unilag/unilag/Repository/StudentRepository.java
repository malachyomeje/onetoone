package com.unilag.unilag.Repository;

import com.unilag.unilag.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    Optional<Student> findByEmail (String email);
}
