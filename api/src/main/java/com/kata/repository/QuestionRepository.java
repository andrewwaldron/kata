package com.kata.repository;

import com.kata.entity.FeedbackEntity;
import com.kata.entity.QuestionEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface QuestionRepository extends CrudRepository<QuestionEntity, UUID> {
}
