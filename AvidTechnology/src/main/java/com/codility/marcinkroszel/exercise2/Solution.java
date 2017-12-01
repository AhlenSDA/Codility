package com.codility.marcinkroszel.exercise2;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {

        Solution solution = new Solution();

        int N = 31;
        System.out.println("N = " + N);
        solution.solution(N);
    }

    public int solution(int N) {

        int[] functionResults = new int[N];

        // CREATE DEFAULT ARRAY
        for (int i = 0; i < functionResults.length; i++) {
            functionResults[i] = getFunction(N - i);
        }
        System.out.println("Default index array:    " + Arrays.toString(functionResults));

        // REVERSE INDEXES OF DEFAULT ARRAY
        for (int i = 0; i < functionResults.length / 2; i++) {
            int temp = functionResults[i];
            functionResults[i] = functionResults[functionResults.length - i - 1];
            functionResults[functionResults.length - i - 1] = temp;
        }
        System.out.println("Reversed index array:   " + Arrays.toString(functionResults));

        // SEARCHING FOR 'L' AND RETURN VALUE
        for (int i = 0; i < functionResults.length; i++) {
            if (functionResults[i] == N) {
                System.out.println("L = " + functionResults[i]);
                System.out.println("Return value = " + (i + 1) + ", because F[" + (i + 1) + "] = " + functionResults[i]); // RETURN VALUE
                return i + 1;
            } else {
                if (functionResults[i] > N) {
                    System.out.println("L = " + functionResults[i - 1]);
                    System.out.println("Return value = " + i + ", because F[" + i + "] = " + functionResults[i - 1]); // RETURN VALUE
                    return i;
                }
            }
        }
        return 0; // not sure if return value from for loop is returning properly
    }

    private int getFunction(int N) {
        int function;

        if (N > 0) {
            function = getFunction(N - 1) + N;
            return function;
        } else {
            return 0;
        }
    }
}



