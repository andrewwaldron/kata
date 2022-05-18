package com.kata.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Data
@Entity
@NoArgsConstructor
@Table(name = "question_possibility")
public class QuestionPossibilityEntity {
    @Id
    @Column(name = "question_possibility_id")
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID questionPossibilityId;

    @Column(name = "question_id")
    private UUID questionId;

    @Column(name = "answer")
    private String answer;

    @Column(name = "question_order")
    private int questionOrder;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", updatable = false, nullable = false)
    private Date createdAt;
}
