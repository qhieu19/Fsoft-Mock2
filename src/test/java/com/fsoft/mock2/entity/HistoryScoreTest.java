package com.fsoft.mock2.entity;

import com.fsoft.mock2.repository.HistoryScoreRepository;
import com.fsoft.mock2.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HistoryScoreTest {

    @Autowired
    private HistoryScoreRepository historyScoreRepository;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testSaveScores(){
        Optional<User> user = userRepository.findById(1);
        HistoryScore historyScore = new HistoryScore();
        historyScore.setTotalScore(33.0D);
        historyScore.setUser(user.get());
        historyScoreRepository.save(historyScore);
    }

}