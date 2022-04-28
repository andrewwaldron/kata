package com.kata.repository;

import com.kata.entity.FeedbackEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface FeedbackRepository extends CrudRepository<FeedbackEntity, UUID> {

}
