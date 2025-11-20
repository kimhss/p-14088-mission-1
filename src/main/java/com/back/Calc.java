package com.back;

public class Calc {

    public static int run(String s) {
        if(s.contains("-")) {
            s = s.replace("- ", "+ -");
        }

        String[] arr = s.split("\\+");
        int num = 0;
        for(String str : arr) {
            num += Integer.parseInt(str.trim());
        }

        return num;
    }
}
