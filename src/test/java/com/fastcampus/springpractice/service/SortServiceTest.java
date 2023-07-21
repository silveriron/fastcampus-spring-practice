package com.fastcampus.springpractice.service;

import com.fastcampus.springpractice.logic.JavaSort;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import  org.junit.jupiter.api.Test;

class SortServiceTest {

    private SortService sut = new SortService(new JavaSort<String>());

    @Test
    void test() {
        List<String> actual = sut.doSort(List.of("3", "5", "1"));

        assertEquals(List.of("1", "3", "5"), actual);
    }
}