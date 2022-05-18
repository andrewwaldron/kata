package com.kata.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class QuestionPossibility {
    private UUID id;
    private String answer;
    private int order;
}
