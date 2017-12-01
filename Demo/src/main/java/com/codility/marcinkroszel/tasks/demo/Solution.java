package com.codility.marcinkroszel.tasks.demo;

import java.util.Arrays;

public class Solution {

    // int[] arrays created for testing different algorithm variation
    private static int[] exampleArray1 = {-1};
    private static int[] exampleArray2 = {1};
    private static int[] exampleArray3 = {0};
    private static int[] exampleArray4 = {0, 1, 2, 3, 4};
    private static int[] exampleArray5 = {-1, -3};
    private static int[] exampleArray6 = {1, 1, 1};
    private static int[] exampleArray7 = {-1, -1};
    private static int[] exampleArray8 = {1, 1, 1, 2, 2, 2};
    private static int[] exampleArray9 = {0, 0, 0,};

    public int solution(int[] A) {

        System.out.println("Unordered array: " + Arrays.toString(A));
        Arrays.sort(A);
        System.out.println("Ascending array: " + Arrays.toString(A));

        // boolean allows separation of each checked condition
        boolean resultFlag = false; // if value is set to false, next condition is entered and int[] is checked
        int result = 0;

        for (int i = 0; i < A.length; i++) {
            if ((A[i] >= 0) && ((A.length == 1))) {
                System.out.println("Searched N = " + (result = A[i] + 1) + "\n");
                resultFlag = true; // if value is set to true, no more following condition are checked
                break;
            }
        }

        if (!resultFlag) {
            for (int i = 0; i < A.length - 1; i++) {
                if ((A[i] >= 0) && ((A[i + 1] - A[i]) > 1)) {
                    System.out.println("Searched N = " + (result = A[i] + 1) + "\n");
                    resultFlag = true;
                    break;
                }
            }
        }

        if (!resultFlag) {
            for (int i = 0; i < A.length; i++) {
                if ((A[i] < 0)) {
                    System.out.println("Searched N = " + (result = 1) + "\n");
                    resultFlag = true;
                    break;
                }
            }
        }

        if (!resultFlag) {
            for (int i = 0; i < A.length; i++) {
                if ((A[i + 1] == A[i]) || (A[i + 1] - A[i]) == 1) {
                    System.out.println("Searched N = " + (result = A[A.length - 1] + 1) + "\n");
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Solution demo = new Solution();
        System.out.println("Array_1");
        demo.solution(exampleArray1);
        System.out.println("Array_2");
        demo.solution(exampleArray2);
        System.out.println("Array_3");
        demo.solution(exampleArray3);
        System.out.println("Array_4");
        demo.solution(exampleArray4);
        System.out.println("Array_5");
        demo.solution(exampleArray5);
        System.out.println("Array_6");
        demo.solution(exampleArray6);
        System.out.println("Array_7");
        demo.solution(exampleArray7);
        System.out.println("Array_8");
        demo.solution(exampleArray8);
        System.out.println("Array_9");
        demo.solution(exampleArray9);
    }
}