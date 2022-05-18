package com.kata.controller;

import com.kata.entity.FeedbackEntity;
import com.kata.repository.FeedbackRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@CrossOrigin
@RequiredArgsConstructor
@RestController
public class FeedbackController {
    private final FeedbackRepository feedbackRepository;

    @PostMapping("/feedback")
    public ResponseEntity<UUID> postFeedback(@RequestBody String feedback) {
        var feedbackEntity = new FeedbackEntity();
        feedbackEntity.setFeedback(feedback);
        feedbackRepository.save(feedbackEntity);

        // Just a demo, for sure. Absolutely.
        return ResponseEntity.ok(UUID.randomUUID());
    }
}
