package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ExecutePalindrom {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Уведіть кількість елементів: ");
        int n = scanner.nextInt();
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Уведіть числа:");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }

        String FindPalindrome = Palindrom.findSecondPalindrom(numbers);
        System.out.println("Паліндром: " + FindPalindrome);
    }
}