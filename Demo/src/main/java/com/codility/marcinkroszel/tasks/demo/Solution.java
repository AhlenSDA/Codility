package com.codility.marcinkroszel.tasks.demo;

import java.util.Arrays;

public class Solution {

    private static int[] exampleArray1 = {-9, -18, -1, 0, 3, -10, -20, 2, 8, 7, 10, 2, 1, 1};                   // return 4
    private static int[] exampleArray2 = {1, 3, 6, 4, 2};                                                       // return 5
    private static int[] exampleArray3 = {0, 1, 1, 2, 3, 5, -1, 0, -1, 0, -1, 5, 7, -100, -2, 3, 4, 0, -1};     // return 6
    private static int[] exampleArray4 = {0, 1, 2, 3, 4};                                                       // return 5
    private static int[] exampleArray5 = {-1, -3};                                                              // return 1
    private static int[] exampleArray6 = {1, 1, 1};                                                             // return 2
    private static int[] exampleArray7 = {2, 2, 2};                                                             // return 3
    private static int[] exampleArray8 = {1, 1, 1, 2, 2, 2};                                                    // return 3

    public int solution(int[] a) {

        System.out.println("Unordered array: " + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Ascending array: " + Arrays.toString(a));

        int result = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if ((a[i] >= 0) && ((a[i + 1] - a[i]) > 1)) {
                System.out.println("Searched N = " + (result = a[i] + 1) + "\n");
                break;
            }
            if ((a[i] < 0)) {
                System.out.println("Searched N = " + (result = 1) + "\n");
                break;
            }
            if ((a[i + 1] == a[i]) || (a[i + 1] - a[i]) == 1) {
                System.out.println("Searched N = " + (result = a[a.length - 1] + 1) + "\n");
                break;
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
    }
}
