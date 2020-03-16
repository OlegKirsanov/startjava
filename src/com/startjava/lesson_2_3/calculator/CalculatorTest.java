package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator testCalc = new Calculator();
        String answer = "да";

        while (answer.equals("да")) {
            Scanner in = new Scanner(System.in);
            String str;
            System.out.print("Введите математическое выражение: ");
            str = in.nextLine();
            testCalc.setEx(str);
            testCalc.getResult();
            System.out.println("");
            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                answer = in.next();
            } while (!answer.equals("да") && !answer.equals("нет"));
        }
    }
}
