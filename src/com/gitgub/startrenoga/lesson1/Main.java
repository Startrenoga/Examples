package com.gitgub.startrenoga.lesson1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Инта
        Scanner in = new Scanner(System.in);
        System.out.println("Напишите значение a/Write value a: ");
        int a = in.nextInt();
        System.out.println("Напишите значение b/Write value b: ");
        int b = in.nextInt();

        System.out.println( a + b );
        System.out.println( a - b );
        System.out.println( a * b );
        System.out.println( a / b );

        // Байта
        System.out.println("Напишите значение c от -128 до 127/Write a value from -128 to 127: ");
        byte c = in.nextByte();
        System.out.println("Напишите значение d от -128 до 127/Write a value from -128 to 127: ");
        byte d = in.nextByte();

        System.out.println( c + d );
        System.out.println( c - d );
        System.out.println( c * d );
        System.out.println( c / d );

        // Склейка строк
        System.out.println("Напишите AA/Write value AA: ");
        String AA = in.nextLine();
        System.out.println("Напишите BB/Write value BB: ");
        String BB = in.nextLine();
        System.out.println( AA + BB );
    }
}
// Git pull - принять все измения с Github
// Git add - добавить под управление Git

//Горячие клавиши
// Ctrl + k - открывает окно commit
// Ctrl + Shift + k - открывает окно push
