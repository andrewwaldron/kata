package com.kata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.assertj.core.api.Assertions.assertThat;

@SpringJUnitConfig
class PermutationProblemTest {
    private PermutationProblem subject;

    @BeforeEach
    void setUp() {
        subject = new PermutationProblem();
    }

    @Test
    void givenThreeNumbers_itPermutesCorrectly() {
        var result = subject.getNextPermutation(new Integer[]{1, 2, 3});

        assertThat(result).isEqualTo(new Integer[]{1, 3, 2});
    }

    @Test
    void sortsRemainingNumbers_afterPermute() {
        var result = subject.getNextPermutation(new Integer[]{1, 2, 4, 3});

        assertThat(result).isEqualTo(new Integer[]{1, 3, 2, 4});
    }

    @Test
    void itReturnsDefault_whenPassedSortedList() {
        var result = subject.getNextPermutation(new Integer[]{4, 3, 2, 1});

        assertThat(result).isEqualTo(new Integer[]{4, 3, 2, 1});
    }
}