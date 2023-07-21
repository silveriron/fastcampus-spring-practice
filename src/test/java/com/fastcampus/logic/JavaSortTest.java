package com.fastcampus.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaSortTest {

    @DisplayName("자바솔트 - 리스트를 넣으면 정렬해준다.")
    @Test
    void given_List_WhenExecuting_ThenReturnSortedList() {
        JavaSort<Integer> javaSort = new JavaSort<>();

        List<Integer> actual = javaSort.sort(List.of(1,4,3,2,5));

        assertEquals(List.of(1,2,3,4,5), actual);
    }

}