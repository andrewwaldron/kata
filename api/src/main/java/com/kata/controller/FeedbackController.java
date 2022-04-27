package com.kata.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RequiredArgsConstructor
@RestController("/feedback")
public class FeedbackController {
    @PostMapping
    public void postFeedback(@RequestBody String feedback) {
        // Obviously this is a test, real posted data should be sanitized before putting it into the logs
        System.out.println("Received feedback: " + feedback);
    }
}
