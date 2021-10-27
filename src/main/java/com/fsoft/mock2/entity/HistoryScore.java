package com.fsoft.mock2.entity;

import com.fsoft.mock2.entity.audit.DateAudit;
import lombok.*;

import javax.persistence.*;

@Entity
@Table (name = "history_scores")
@Getter
@Setter
@NoArgsConstructor
public class HistoryScore extends DateAudit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "total_score")
    private Double totalScore;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Override
    public String toString() {
        return "HistoryScore{" +
                "id=" + id +
                ", totalScore=" + totalScore +
                '}';
    }
}
