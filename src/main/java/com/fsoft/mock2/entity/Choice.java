package com.fsoft.mock2.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table (name = "choices")
@Getter
@Setter
@NoArgsConstructor
public class Choice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "choice_id")
    private Integer choiceId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "question_id")
    private Question question;

    @Column(name = "choice")
    private String choice;

    @Column(name = "is_correct")
    private boolean isCorrect;

    public Choice(Question question, String choice, boolean isCorrect) {
        this.question = question;
        this.choice = choice;
        this.isCorrect = isCorrect;
    }

    @Override
    public String toString() {
        return "Choice{" +
                "choiceId=" + choiceId + '\'' +
                ", choice='" + choice + '\'' +
                ", isCorrect=" + isCorrect +
                '}';
    }
}
