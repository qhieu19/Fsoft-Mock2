package com.fsoft.mock2.repository;

import com.fsoft.mock2.entity.HistoryScore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface HistoryScoreRepository extends JpaRepository<HistoryScore, Integer> {
    @Query(value="SELECT h FROM HistoryScore h WHERE h.user.id = ?1")
    List<HistoryScore> getHistoryScoreByUserId(Integer userId);
}