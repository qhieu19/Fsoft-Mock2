package com.fsoft.mock2.service;

import com.fsoft.mock2.dto.response.QuestionResponse;

import java.util.List;

public interface IQuestionService {
    List<QuestionResponse> loadQuestion(Integer quantity);
}
