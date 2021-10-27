package com.fsoft.mock2.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table (name = "questions")
@Getter
@Setter
@NoArgsConstructor
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "question_id")
    private Integer questionId;

    @Column(name = "question")
    private String question;

    @Override
    public String toString() {
        return "Question{" +
                "questionId=" + questionId + '\'' +
                ", question='" + question + '\'' +
                '}';
    }
}
