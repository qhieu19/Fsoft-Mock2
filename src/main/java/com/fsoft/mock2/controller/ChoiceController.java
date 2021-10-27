package com.fsoft.mock2.controller;

import com.fsoft.mock2.dto.response.ChoiceResponse;
import com.fsoft.mock2.service.IChoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/choice")
public class ChoiceController {
    @Autowired
    private IChoiceService iChoiceService;

    @RequestMapping("{questionId}")
    public List<ChoiceResponse> getChoice(@PathVariable Integer questionId) {
        return iChoiceService.loadChoice(questionId);
    }
}
