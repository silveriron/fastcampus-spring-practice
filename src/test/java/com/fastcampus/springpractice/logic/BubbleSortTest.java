package com.fastcampus.springpractice.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BubbleSortTest {

    @DisplayName("버블솔트 - 리스트를 넣으면 정렬해준다.")
    @Test
    void given_List_WhenExecuting_ThenReturnSortedList() {
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();

        List<Integer> actual = bubbleSort.sort(List.of(1,4,3,2,5));

        assertEquals(List.of(1,2,3,4,5), actual);
    }
}