package com.startjava.lesson_1.calculator;

import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    System.out.println("Введите 1-е число: ");
    int num1 = in.nextInt();

    System.out.println("Введите вид операции (+, -, *, /, ^, %): ");
    char oper = in.next().charAt(0);

    System.out.println("Введите 2-е число: ");
    int num2 = in.nextInt();

    if (oper == '+') {
      System.out.println("Ответ: " + (num1 + num2));
    } else if (oper == '-') {
        System.out.println("Ответ: " + (num1 - num2));
    } else if (oper == '*') {
        System.out.println("Ответ: " + (num1 * num2));
    } else if (oper == '/') {
        System.out.println("Ответ: " + (num1 / num2));
    } else if (oper == '^') {
        int numDegree = num1;
        for (int i = 1; i < num2; i++) {
          numDegree = num1 * numDegree;
        }
        System.out.println("Ответ: " + numDegree);
    } else if (oper == '%') {
        System.out.println("Ответ: " + (num1 % num2));
    }

  in.close();

  }
}
