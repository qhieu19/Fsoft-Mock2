package com.fsoft.mock2.dto.mapper;

import com.fsoft.mock2.dto.response.ChoiceResponse;
import com.fsoft.mock2.entity.Choice;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ChoiceMapper {
    public List<ChoiceResponse> getChoiceResponse(List<Choice> choices){
        List<ChoiceResponse> choiceResponse = new ArrayList<>();
        choices.forEach(choice -> choiceResponse.add(choiceMapper(choice)));
        return choiceResponse;
    }

    public ChoiceResponse choiceMapper(Choice choice){
        ChoiceResponse choiceResponse = new ChoiceResponse();
        choiceResponse.setChoice(choice.getChoice());
        choiceResponse.setCorrect(choice.isCorrect());
        return choiceResponse;
    }
}
