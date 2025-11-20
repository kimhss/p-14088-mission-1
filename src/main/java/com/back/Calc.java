package com.back;

public class Calc {

    public static int run(String s) {
        if(s.contains("-")) {
            s = s.replace("- ", "+ -");
        }
        if(s.contains("*")) {
            String[] arr = s.split("\\*");
            int sum = 1;
            for(String str : arr) {
                sum *= Integer.parseInt(str.trim());
            }

            return sum;

        }

        String[] arr = s.split("\\+");
        int sum = 0;
        for(String str : arr) {
            sum += Integer.parseInt(str.trim());
        }

        return sum;
    }
}
