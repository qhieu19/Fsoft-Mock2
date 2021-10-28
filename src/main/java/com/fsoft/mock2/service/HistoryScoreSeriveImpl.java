package com.fsoft.mock2.service;

import com.fsoft.mock2.dto.mapper.HistoryScoreMapper;
import com.fsoft.mock2.dto.response.HistoryScoreResponse;
import com.fsoft.mock2.entity.HistoryScore;
import com.fsoft.mock2.repository.HistoryScoreRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoryScoreSeriveImpl implements IHistoryScoreService{

    private final HistoryScoreRepository historyScoreRepository;
    private final HistoryScoreMapper historyScoreMapper;

    public HistoryScoreSeriveImpl(HistoryScoreRepository historyScoreRepository, HistoryScoreMapper historyScoreMapper) {
        this.historyScoreRepository = historyScoreRepository;
        this.historyScoreMapper = historyScoreMapper;
    }

    @Override
    public List<HistoryScoreResponse> getHistoryScoreByUserId(Integer userId) {
        List<HistoryScore> historyScore = historyScoreRepository.getHistoryScoreByUserId(userId);
        return historyScoreMapper.getHistoryResponse(historyScore);
    }
}
