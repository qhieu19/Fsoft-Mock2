package com.fsoft.mock2.repository;

import com.fsoft.mock2.entity.Choice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChoiceRepository extends JpaRepository<Choice, Integer> {
}