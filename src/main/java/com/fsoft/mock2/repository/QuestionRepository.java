package com.fsoft.mock2.repository;

import com.fsoft.mock2.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Integer> {

    @Query(nativeQuery=true, value="select * from questions order by rand() limit ?1")
    List<Question> getQuestions(Integer quantity);
}