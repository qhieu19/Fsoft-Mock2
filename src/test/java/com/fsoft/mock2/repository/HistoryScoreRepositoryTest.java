package com.fsoft.mock2.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

@SpringBootTest
class HistoryScoreRepositoryTest {

    @Autowired
    private HistoryScoreRepository historyScoreRepository;

    @Test
    @Transactional
    public void getHistoryScore(){
        System.out.println(historyScoreRepository.getHistoryScoreByUserId(1));
    }
}