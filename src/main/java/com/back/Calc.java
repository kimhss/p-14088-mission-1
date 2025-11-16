package com.back;

public class Calc {

    public static int run(String s) {

        String[] str = s.split(" ");

        int a = Integer.parseInt(str[0].trim());
        int b = Integer.parseInt(str[2].trim());
        String calc = str[1];

        switch (calc) {
            case "+" -> {
                return a + b;
            }
            case "-" -> {
                return a - b;
            }
        }

        return 0;
    }
}
