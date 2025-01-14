package com.baseball.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryTest {
    private Repository repository;

    @BeforeEach
    void setUp() {
        repository = new Repository(new int[3], new int[3], new HashSet<>());
    }

    @Test
    void testInitialization() {
        assertEquals(3, repository.getAnswer().length);
        assertEquals(3, repository.getGenerateNumber().length);
        assertTrue(repository.getDigits().isEmpty());
    }
}

