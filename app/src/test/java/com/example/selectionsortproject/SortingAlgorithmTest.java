package com.example.selectionsortproject;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Assert;

public class SortingAlgorithmTest {
    private final SortingAlgorithm insertionSort = new SortingAlgorithm();

    @Test
    public void checkInput() {
        String result = insertionSort.checkInput("1 2 3 4");
        assertEquals("1 2 3 4", result);
        result = insertionSort.checkInput("1 2 3");
        assertEquals("1 2 3", result);
        result = insertionSort.checkInput("1 2 3 4 5 6 7 8");
        assertEquals("1 2 3 4 5 6 7 8", result);
        result = insertionSort.checkInput("1 2 3 4 5 6 7 8 9");
        assertEquals("Input length should be between 3 and 8", result);
        result = insertionSort.checkInput("1 2");
        assertEquals("Input length should be between 3 and 8", result);
        result = insertionSort.checkInput("-1 2 3");
        assertEquals("Input has to be single digit integers", result);
        result = insertionSort.checkInput("11 33 444");
        assertEquals("Input has to be single digit integers", result);
        result = insertionSort.checkInput("hi");
        assertEquals("Input has to be single digit integers", result);
        result = insertionSort.checkInput("1.1 3 4.4");
        assertEquals("Input has to be single digit integers", result);
        result = insertionSort.checkInput("quit");
        assertEquals("quit", result);
    }

//    @Test
//    public void parseInput() {
//        int[] result = insertionSort.parseInput("1 2 3 4");
//        Assert.assertArrayEquals(new int[]{1, 2, 3, 4}, result);
////        assertEquals(new int[]{1, 2, 3, 4}, result);
//        result = insertionSort.parseInput("1 2 3");
//        Assert.assertArrayEquals(new int[]{1, 2, 3}, result);
//        result = insertionSort.parseInput("1 2 3 4 5 6 7 8");
//        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, result);
//    }
//
//    @Test
//    public void insertionSort() {
//        String result = insertionSort.insertionSort("1 5 7 2 4");
//        assertEquals("your input: 1 5 7 2 4\n[1, 5, 7, 2, 4]\n[1, 5, 7, 2, 4]\n[1, 2, 5, 7, 4]\n[1, 2, 4, 5, 7]\n", result);
//        result = insertionSort.insertionSort("3 2 1");
//        assertEquals("your input: 3 2 1\n[2, 3, 1]\n[1, 2, 3]\n", result);
//        result = insertionSort.insertionSort("8 7 6 5 4 3 2 1");
//        assertEquals("your input: 8 7 6 5 4 3 2 1\n[7, 8, 6, 5, 4, 3, 2, 1]\n[6, 7, 8, 5, 4, 3, 2, 1]\n[5, 6, 7, 8, 4, 3, 2, 1]\n[4, 5, 6, 7, 8, 3, 2, 1]\n[3, 4, 5, 6, 7, 8, 2, 1]\n[2, 3, 4, 5, 6, 7, 8, 1]\n[1, 2, 3, 4, 5, 6, 7, 8]\n", result);
//    }
}