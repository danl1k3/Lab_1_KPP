package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExecuteStringPal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Уведіть строку та індекс початку та кінця діапазону(початок з 0):");
        String TargetSt = scanner.next();
        int st = scanner.nextInt();
        int end = scanner.nextInt();

        List<String> palindrom = Palindrom.findMaxPalindrom(TargetSt, st, end);
        if(palindrom.isEmpty()){
            System.out.println("[Error]");
        }
        else {
            System.out.println("Паліндроми: " + palindrom);
        }
    }
}
