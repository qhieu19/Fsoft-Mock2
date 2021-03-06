package com.fsoft.mock2.dto.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class QuestionResponse {
    private Integer questionId;
    private String question;
}
