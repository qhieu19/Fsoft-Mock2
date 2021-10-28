package com.fsoft.mock2.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class HistoryScoreResponse {
    private Integer userId;
    private Double Score;
    private LocalDateTime createAt;

    public HistoryScoreResponse(Integer userId) {
        this.userId = userId;
    }

    public HistoryScoreResponse() {

    }
}
