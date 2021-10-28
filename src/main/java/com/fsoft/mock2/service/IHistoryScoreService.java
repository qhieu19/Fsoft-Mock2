package com.fsoft.mock2.service;

import com.fsoft.mock2.dto.response.HistoryScoreResponse;

import java.util.List;

public interface IHistoryScoreService {
    public List<HistoryScoreResponse> getHistoryScoreByUserId(Integer userId);
}
