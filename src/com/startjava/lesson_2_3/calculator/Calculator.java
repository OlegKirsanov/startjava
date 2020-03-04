package com.startjava.lesson_2_3.calculator;

public class Calculator {
    private int num1;
    private int num2;
    private char oper;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setOper(char oper) {
        this.oper = oper;
    }

    public void getResult() {
      int numDegree = num1;
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
            System.out.println("Ответ: " + (num1 / num2));
            break;
        case '^':
            for (int i = 1; i < num2; i++) {
                numDegree = num1 * numDegree;
            }
            System.out.println("Ответ: " + (numDegree));
            break;
        case '%':
            System.out.println("Ответ: " + (num1 % num2));
            break;
       }
    }
}
