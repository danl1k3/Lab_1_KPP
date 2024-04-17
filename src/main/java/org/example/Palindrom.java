package org.example;

import java.util.ArrayList;
import java.util.*;

public class Palindrom {
    static List<String> Ans = new ArrayList<>();
    public static boolean isPalindrom(String text) {
        String curr = text.replaceAll("\\s+", "").toLowerCase();
        int length = curr.length();
        int start = 0;
        int end = length - 1;
        if(curr.length()==1||curr.isEmpty()){
            return false;
        }
        else {
            while (end >= start) {
                char StChar = curr.charAt(start++);
                char EndChar = curr.charAt(end--);
                if (StChar != EndChar)
                    return false;
            }
            return true;
        }
    }

    public static List<String> findMaxPalindrom(String input, int st, int end) {
        Ans.clear();
        if(st==end|| st<0|| end<0){
            return Ans;
        }
        String subStr = input.substring(st, end + 1);
        if (subStr.length() <= 2) {
            isPalindrom(subStr);
            return Collections.singletonList(subStr);
        }
        generator("", subStr);
        Set<String> set = new HashSet<>(Ans);
        List<String> uAns = new ArrayList<>(set);
            return uAns;
    }

    private static void generator(String prefix, String remaining) {
        int n = remaining.length();
        if (n == 0) {
            if(isPalindrom(prefix)) {
                Ans.add(prefix);
            }
        } else {
            for (int i = 0; i < n; i++) {
                generator(prefix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1));
            }
            generator(prefix, remaining.substring(1)); // Рекурсивний виклик без першого символу
        }
    }


    public static String findSecondPalindrom(List<Integer> numbers) {
        List<Integer> palindromes = new ArrayList<>();
        for (int num : numbers) {
            String numStr = String.valueOf(num);
            if (isPalindrom(numStr)) {
                palindromes.add(num);
            }
        }

        if (palindromes.isEmpty()) {
            return "Паліндром не знайдено";
        }
        else if (palindromes.size()==1) {
            return String.valueOf(palindromes.getFirst());
        }
        else {
            return String.valueOf(palindromes.get(1));
        }
    }


}
