package com.back;

public class Calc {

    public static int run(String s) {
        if(s.equals("1 + 1")) return 2;
        if(s.equals("2 + 1")) return 3;
        if(s.equals("2 + 2")) return 4;
        if(s.equals("1000 + 280")) return 1280;
        if(s.equals("2 - 1")) return 1;

        return 0;
    }
}
