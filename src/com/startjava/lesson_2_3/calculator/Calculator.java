package com.startjava.lesson_2_3.calculator;

import java.lang.Math;
import java.util.Arrays;

public class Calculator {
    private String str;

    public void setEx(String str) {
        this.str = str;
    }

      public void getResult() {
        String[] exp = str.split(" ");
        int num1 = Integer.parseInt(exp[0]);
        char oper = exp[1].charAt(0);
        int num2 = Integer.parseInt(exp[2]);
      switch (oper) {
        case '+':
            System.out.println("Ответ: " + (num1 + num2));
            break;
        case '-':
            System.out.println("Ответ: " + (num1 - num2));
            break;
        case '*':
            System.out.println("Ответ: " + (num1 * num2));
            break;
        case '/':
            System.out.println("Ответ: " + Math.floorDiv(num1, num2));
            break;
        case '^':
            System.out.println("Ответ: " + Math.pow(num1, num2));
            break;
          default:
              System.out.println("Произошла ошибка!");
       }
    }
}
