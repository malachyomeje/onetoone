package com.unilag.unilag.Repository;

import com.unilag.unilag.dto.request.StudentDto;
import com.unilag.unilag.model.StudentCardNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CardRepository extends JpaRepository<StudentCardNumber,Long> {
  Optional<StudentCardNumber> findByCardNumber(String cardNo);
  Optional<StudentCardNumber>deleteByCardNumber(String deleteCardNumber);

}
