package com.back;

public class Calc {

    public static int run(String s) {
        s = s.trim();

        // 필수로
        if(s.contains("-")) {
            s = s.replace("- ", "+ -");
        }

        // -(10 + 5)
        // 괄호 벗기기 + 괄호 먼저 계산
        if(s.contains("(") && s.contains(")")) {
            String result = "";
            String pareBits = "";
            boolean isParenthesis = false;
            String[] sBits = s.split("");
            for(int i = 0; i < sBits.length; i++) {
                if(sBits[i].equals("(")) {
                    isParenthesis = true;
                    continue;

                }
                if(sBits[i].equals(")")) {
                    if(!isParenthesis) continue;
                    result += String.valueOf(run(pareBits));
                    pareBits = "";
                    isParenthesis = false;
                    continue;
                }

                if(isParenthesis) {
                    pareBits += sBits[i];
                }
                else if(!isParenthesis) {
                    pareBits = "";
                    result += sBits[i];
                }
            }

            return run(result);
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

        return Integer.parseInt(s);
    }
}