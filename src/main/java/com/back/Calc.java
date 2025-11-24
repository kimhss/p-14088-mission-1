package com.back;

public class Calc {

    public static int run(String s) {

        // 10 + 5 * 2

        // 필수로
        if(s.contains("-")) {
            s = s.replace("- ", "+ -");
        }

        if(s.contains("*") && !s.contains("+")) {
            String[] arr = s.split("\\*");
            int sum = 1;
            for(String str : arr) {
                sum *= Integer.parseInt(str.trim());
            }
            return sum;
        }

        // 10 + 5 * 2
        int sum = 0;
        if(s.contains("+")) {
            String[] arr = s.split("\\+");
            for(String str : arr) {
                if(str.contains("*")) sum += run(str.trim());
                else sum += Integer.parseInt(str.trim());
            }
        }

        return sum;
    }
}
