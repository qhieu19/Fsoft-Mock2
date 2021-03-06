package com.fsoft.mock2.controller;

import com.fsoft.mock2.dto.response.QuestionResponse;
import com.fsoft.mock2.service.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/question")
public class QuestionController {

    @Autowired
    private IQuestionService iQuestionService;

    @GetMapping("{quantity}")
    public List<QuestionResponse> getQuestion(@PathVariable Integer quantity) {
        return iQuestionService.loadQuestion(quantity);
    }
}
