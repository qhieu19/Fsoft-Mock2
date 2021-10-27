package com.fsoft.mock2.service;

import com.fsoft.mock2.dto.mapper.QuestionMapper;
import com.fsoft.mock2.dto.response.QuestionResponse;
import com.fsoft.mock2.entity.Question;
import com.fsoft.mock2.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements IQuestionService{

    private final QuestionRepository questionRepository;
    private final QuestionMapper questionMapper;

    public QuestionServiceImpl(QuestionMapper questionMapper, QuestionRepository questionRepository) {
        this.questionMapper = questionMapper;
        this.questionRepository = questionRepository;
    }

    @Override
    public List<QuestionResponse> loadQuestion(Integer quantity) {
        List<Question> questions = questionRepository.getQuestions(quantity);
        return questionMapper.getQuestionResponse(questions);
    }
}
