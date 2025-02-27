package com.example.project.Insertion_Sort;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {

    // PART A. implementing insertion sort
    public static int[] insertionSort(int[] elements) {
        int count = 0;
        for (int i = 1; i < elements.length; i++) {
            int element = elements[i];
            int k = i;
            while (k > 0 && elements[k-1] > element) {
                count++;
                elements[k] = elements[k-1];
                k--;    
            }
            elements[k] = element;
        }
        System.out.println("INSERTION SORT: Number of loop iterations: " + count);
        return elements;
    }

   
    public static int[] selectionSort(int[] elements) {
        int count = 0;
        int minIdx;
        for (int i = 0; i < elements.length; i++) {
            minIdx = i;
            for (int k = i + 1; k < elements.length; k++) {
                count++;
                if (elements[k] < elements[minIdx]) {
                    minIdx = k;
                }
            }
            int min = elements[minIdx];
            elements[minIdx] = elements[i];
            elements[i] = min;
        }
        System.out.println("SELECTION SORT: Number of loop iterations: " + count);
        return elements;
    }

    // PART B. sorting a 1000-word list
    public static ArrayList<String> insertionSortWordList(ArrayList<String> words) {
        int count = 0;
        for (int i = 1; i < words.size(); i++) {
            String element = words.get(i);
            int k = i;
            while (k > 0 && words.get(k-1).compareTo(element) > 0) {
                count++;
                words.set(k, words.get(k-1));
                k--;    
            }
            words.set(k,element);
        }
        System.out.println("INSERTION SORT: Number of loop iterations: " + count);
        return words;
    }

    public static ArrayList<String> selectionSortWordList(ArrayList<String> words) {
        String min;
        int minIdx;
        int count = 0;
        for (int i = 0; i < words.size(); i++) {
            min = words.get(i);
            minIdx = i;
            for (int k = i; k < words.size(); k++) {
                count++;
                if (words.get(k).compareTo(min) < 0) {
                    min = words.get(k);
                    minIdx = k;
                }
            }
            words.set(minIdx, words.set(i, min));
        }
        System.out.println("SELECTION SORT: Number of loop iterations: " + count);
        return words;
    }

    public static ArrayList<String> loadWordsInto(ArrayList<String> wordList) {
        try {
            Scanner input = new Scanner(new File("src/main/java/com/example/project/Selection_Sort/words.txt"));
            while (input.hasNext()) {
                String word = input.next();
                wordList.add(word);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return wordList;
    }

   
}