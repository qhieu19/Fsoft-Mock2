package com.fsoft.mock2.repository;

import com.fsoft.mock2.entity.Question;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class QuestionRepositoryTest {

    @Autowired
    private QuestionRepository questionResponse;

    @Test
    public void getIDmax(){
        System.out.println(questionResponse.getQuestions(4));
    }
}