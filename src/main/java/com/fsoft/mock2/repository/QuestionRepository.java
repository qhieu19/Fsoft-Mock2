package com.fsoft.mock2.repository;

import com.fsoft.mock2.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
}