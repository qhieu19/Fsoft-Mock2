package com.fsoft.mock2.controller;

import com.fsoft.mock2.dto.response.HistoryScoreResponse;
import com.fsoft.mock2.service.IHistoryScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/history-score")
public class HistoryScoreController {

    @Autowired
    private IHistoryScoreService iHistoryScoreService;

    @GetMapping("{userId}")
    public List<HistoryScoreResponse> getHistoryScore(@PathVariable Integer userId) {
        return iHistoryScoreService.getHistoryScoreByUserId(userId);
    }
}
