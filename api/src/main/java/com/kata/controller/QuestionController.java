package com.kata.controller;

import com.kata.dto.Question;
import com.kata.entity.FeedbackEntity;
import com.kata.entity.QuestionEntity;
import com.kata.repository.FeedbackRepository;
import com.kata.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@CrossOrigin
@RestController
@RequiredArgsConstructor
public class QuestionController {
    private final QuestionRepository questionRepository;

    @PostMapping("/question")
    public ResponseEntity<UUID> postFeedback(@RequestBody Question question) {
        QuestionEntity entity = new QuestionEntity();

        entity.setUserId(UUID.randomUUID());
        entity.setQuestion(question.getQuestion());
        questionRepository.save(entity);

        return ResponseEntity.ok().build();
    }
}
