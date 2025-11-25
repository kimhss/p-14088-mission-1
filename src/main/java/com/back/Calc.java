package com.back;

public class Calc {

    public static int run(String s) {
        s = s.trim();

        // 필수로
        if(s.contains("-")) {
            s = s.replace("- ", "+ -");
        }

        // -(10 + 5)
        // (10 + 20) * 3
        // 괄호 벗기기 + 괄호 먼저 계산
        if(s.contains("(") && s.contains(")")) {
            if (s.contains("*")) {
                String answer = "";
                String[] tmp = s.split("\\*");
                for (String str : tmp) {
                    str = str.trim();
                    if (str.contains("(") && str.contains(")")) {
                        answer += String.valueOf(run(str.replaceAll("[()]", "")));
                    } else answer += " * " + str;
                }

                return run(answer);
            }
            else if (s.contains("-(")) {
                s = s.replaceAll("[()]", "");
                s = s.replace("+ ", "+ -");
                return run(s);
            }
            else {
                String tmp = s.replaceAll("[()]", "");
                return run(tmp);
            }
        }

        // 10 + 5 * 2
        int sum = 0;
        if(s.contains("+")) {
            String[] arr = s.split("\\+");
            for(String str : arr) {
                if(str.contains("*")) sum += run(str.trim());
                else sum += Integer.parseInt(str.trim());
            }
            return sum;
        }

        int mul = 1;
        if(s.contains("*") && s.contains(" ")) {
            String[] arr = s.split("\\*");
            for(String str : arr) {
                mul *= Integer.parseInt(str.trim());
            }
            return mul;
        }

        return sum;
    }
}
