package com.codility.marcinkroszel.exercise1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Solution {

    private String solution(int T) {

        // T = {0 .. 86399 }

        Date date = new Date(T * 1000);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("H'h'm'm's's'");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));

        String convertedTime = simpleDateFormat.format(date);

        System.out.println(convertedTime);
        return convertedTime;
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        solution.solution(7500);
    }
}
