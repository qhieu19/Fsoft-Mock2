package com.fsoft.mock2.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import javax.persistence.*;

@Entity
@Table (name = "choices")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Choice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "choice_id")
    private int choiceId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "question_id")
    private Question question;

    @Column(name = "choice")
    private String choice;

    @Column(name = "is_correct")
    private boolean isCorrect;

    @Override
    public String toString() {
        return "Choice{" +
                "choiceId=" + choiceId + '\'' +
                ", choice='" + choice + '\'' +
                ", isCorrect=" + isCorrect +
                '}';
    }
}
