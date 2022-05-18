package com.kata.repository;

import com.kata.entity.QuestionVoteEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface QuestionVoteRepository extends CrudRepository<QuestionVoteEntity, UUID> {
}
