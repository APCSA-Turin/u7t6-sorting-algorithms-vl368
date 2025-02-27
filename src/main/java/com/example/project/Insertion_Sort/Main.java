package com.example.project.Insertion_Sort;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrA = {93,98,70,97,15,94,66,65,100,86,54,20,31,28,67,71,27,1,79,8,4,29,60,44,32,46,72,6,51,18,41,36,85,14,19};
        InsertionSort.selectionSort(arrA);
        System.out.println(Arrays.toString(arrA));
        System.out.println();
        int[] arrB = {93,98,70,97,15,94,66,65,100,86,54,20,31,28,67,71,27,1,79,8,4,29,60,44,32,46,72,6,51,18,41,36,85,14,19};
        InsertionSort.insertionSort(arrB);
        System.out.println(Arrays.toString(arrB));

        ArrayList<String> wordsA = new ArrayList<>();
        ArrayList<String> wordsB = new ArrayList<>();
        InsertionSort.loadWordsInto(wordsA);
        InsertionSort.loadWordsInto(wordsB);
        InsertionSort.selectionSortWordList(wordsA);
        InsertionSort.insertionSortWordList(wordsB);
    }
}