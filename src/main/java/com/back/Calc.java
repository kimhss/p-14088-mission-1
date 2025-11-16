package com.back;

public class Calc {

    public static int run(String s) {
        // "10 + 20 + 30 == 60"

//        if (s.equals("10 + 20 + 30")) return 60;
//        if (s.equals("10 - 20 + 30")) return 20;

        if(!s.contains(" ")) return Integer.parseInt(s);
        String[] str = s.split(" ", 3);

        int a = Integer.parseInt(str[0].trim());
        String calc = str[1].trim();

        switch (calc) {
            case "+" -> {
                return a + run(str[2].trim());
            }
            case "-" -> {
                return a - run(str[2].trim());
            }
        }

        return 0;
    }
}
