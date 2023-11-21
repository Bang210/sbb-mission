package com.ll.sbbmission.main.repository;

import com.ll.sbbmission.main.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
}
