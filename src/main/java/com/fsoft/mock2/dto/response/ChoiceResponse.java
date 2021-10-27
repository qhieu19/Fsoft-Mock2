package com.fsoft.mock2.dto.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class ChoiceResponse {
    private String choice;
    private boolean isCorrect;
}
