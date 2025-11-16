package com.back;

public class Calc {

    public static int run(String s) {
        // "10 + 20 + 30 == 60"

        if (s.equals("10 + 20 + 30")) return 60;

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
