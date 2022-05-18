package com.kata.repository;

import com.kata.entity.QuestionPossibilityEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface QuestionPossibilityRepository extends CrudRepository<QuestionPossibilityEntity, UUID> {
}
