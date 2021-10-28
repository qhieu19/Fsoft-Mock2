package com.fsoft.mock2.dto.mapper;

import com.fsoft.mock2.dto.response.HistoryScoreResponse;
import com.fsoft.mock2.entity.HistoryScore;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class HistoryScoreMapper {
    public List<HistoryScoreResponse> getHistoryResponse(List<HistoryScore> historyScores){
        List<HistoryScoreResponse> historyScoreResponses = new ArrayList<>();
        historyScores.forEach(historyScore -> historyScoreResponses.add(historyMapper(historyScore)));
        return historyScoreResponses;
    }

    public HistoryScoreResponse historyMapper(HistoryScore historyScore){
        HistoryScoreResponse historyScoreResponse = new HistoryScoreResponse();
        historyScoreResponse.setScore(historyScore.getTotalScore());
        historyScoreResponse.setCreateAt(historyScore.getCreateAt());
        historyScoreResponse.setUserId(historyScore.getId());
        return historyScoreResponse;
    }
}
