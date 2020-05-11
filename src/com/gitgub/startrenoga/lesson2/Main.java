package com.gitgub.startrenoga.lesson2;

import java.util.Scanner;

public class Main {
    public int Kub(int a) {
        if (a == 0) return 0;
        if (a == 1) return 1;
        if (a == 2) return 1;

        int m = 1;
        int n = 1;
        int result = 0;

        for (int i = 2; i < a; i++) {
            result = m + n;
            m = n;
            n = result;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Напишите порядковый номер числа Фибоначчи/Write the sequence number of the Fibonacci number: ");
        int F = in.nextInt();
        Main solution = new Main();
        System.out.println(solution.Kub(F));
    }
}