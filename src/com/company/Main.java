package com.company;

public class Main {

    public static void main(String[] args) {

        /*
        int intVariable = 55;
        short shortVariable = 32000;
        float floatVariable = 55.5f;
        char ch = 'A';
        boolean bool = true;
        System.out.println("This is int variable");
        System.out.println(intVariable);
        System.out.println("This is short variable");
        System.out.println(shortVariable);
        System.out.println("This is float variable");
        System.out.println(floatVariable);
        System.out.println("This is char");
        System.out.println(ch);
        System.out.println("This is boolean");
        System.out.println(bool);
        */
        /*
        int x1 = 100;
        int x2 = 15;
        int result1 = x1 + x2; // сложение
        int result2 = x1 - x2; // вычетание
        int result3 = x1 * x2; // умножение
        int result4 = x1 / x2; // деление, выводится целое число, отбрасывается дробная часть
        int result5 = x1 % x2; // выводит остаток от деления
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);

        double d1 = 33.45;
        double d2 = 23.11;
        double d_result = d1 / d2;
        System.out.println(d_result);
        */
        /*
        double d1 = 44.5;
        int i1 = (int) Math.round(d1);
        System.out.println(i1);

        int i2 = 344;
        long l1 = i2; // неявное преобразование
        int i3 = (int)l1; // явное проеобразование
        short s1 = 30;
        short s2 = (short)i3;
        */
        /*
        int x1 = 10;
        int x2 = 15;
        // операторы сравнения <, >, <=, >=, ==, !=
        // операторы x++, x--
        // *=, /=, %=
        boolean x3 = x1 != x2;
        System.out.println(x3);
        */
        /*
        int x1 = 10;
        int x2 = 10;
        boolean x3 = x1 == x2;
        System.out.println(x3);
        x1 = x1++; // тоже самое что и  x1 = x1 + 1
        x3 = x1 == x2;
        System.out.println(x3);
        // x1 *= 2 (умножить на 2)
        // x1 *= 3 (умножить на 3)
        */

        int x1 = 10;
        int x2 = 10;
        // boolean x3 = x1 == x2; значение boolean по умолчании true
        if (x1 == x2) {
            System.out.println("x1 = x2");
        } else if (x1 > x2) {
            System.out.println("x1 > x2");
        } else if (x1 < x2) {
            System.out.println("x1 < x2");
        }
    }
}
