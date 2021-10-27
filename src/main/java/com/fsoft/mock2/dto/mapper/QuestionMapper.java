package com.fsoft.mock2.dto.mapper;

import com.fsoft.mock2.dto.response.QuestionResponse;
import com.fsoft.mock2.entity.Question;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class QuestionMapper {
    public List<QuestionResponse> getQuestionResponse(List<Question> questions){
        List<QuestionResponse> questionResponse = new ArrayList<>();
        questions.forEach(question -> questionResponse.add(questionMapper(question)));
        return questionResponse;
    }

    public QuestionResponse questionMapper(Question question){
        QuestionResponse questionResponse = new QuestionResponse();
        questionResponse.setQuestionId(question.getQuestionId());
        questionResponse.setQuestion(question.getQuestion());
        return questionResponse;
    }
}
