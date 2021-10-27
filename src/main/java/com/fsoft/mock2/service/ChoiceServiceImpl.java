package com.fsoft.mock2.service;

import com.fsoft.mock2.dto.mapper.ChoiceMapper;
import com.fsoft.mock2.dto.response.ChoiceResponse;
import com.fsoft.mock2.entity.Choice;
import com.fsoft.mock2.repository.ChoiceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChoiceServiceImpl implements IChoiceService{
    private final ChoiceRepository choiceRepository;
    private final ChoiceMapper choiceMapper;

    public ChoiceServiceImpl(ChoiceRepository choiceRepository, ChoiceMapper choiceMapper) {
        this.choiceRepository = choiceRepository;
        this.choiceMapper = choiceMapper;
    }

    @Override
    public List<ChoiceResponse> loadChoice(Integer questionId) {
        List<Choice> choices = choiceRepository.getChoices(questionId);
        return choiceMapper.getChoiceResponse(choices);
    }
}
