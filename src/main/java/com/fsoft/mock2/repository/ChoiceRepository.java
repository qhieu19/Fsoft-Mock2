package com.fsoft.mock2.repository;

import com.fsoft.mock2.entity.Choice;
import com.fsoft.mock2.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ChoiceRepository extends JpaRepository<Choice, Integer> {
    @Query(nativeQuery=true, value="SELECT * FROM choices c WHERE c.question_id = ?1")
    List<Choice> getChoices(Integer questionId);
}