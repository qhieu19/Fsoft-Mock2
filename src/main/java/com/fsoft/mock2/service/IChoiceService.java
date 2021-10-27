package com.fsoft.mock2.service;

import com.fsoft.mock2.dto.response.ChoiceResponse;

import java.util.List;

public interface IChoiceService {
    List<ChoiceResponse> loadChoice(Integer questionId);
}
