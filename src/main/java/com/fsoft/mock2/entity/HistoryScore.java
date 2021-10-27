package com.fsoft.mock2.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "history_scores")
@Getter
@Setter
@NoArgsConstructor
public class HistoryScore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "total_score")
    private float totalScore;

    @Column(name = "created_at")
    private Date createdAt;

    public HistoryScore(User user, float totalScore, Date createdAt) {
        this.user = user;
        this.totalScore = totalScore;
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "HistoryScore{" +
                "id=" + id +
                ", user=" + user +
                ", totalScore=" + totalScore +
                ", createdAt=" + createdAt +
                '}';
    }
}
