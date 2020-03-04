package com.startjava.lesson_2_3.game;

import java.lang.Math;

public class GuessNumber {

  public int generateNum(int min, int max){
    int range = max - min + 1;
    System.out.println((int)(Math.random() * range) + min);
    return (int)(Math.random() * range) + min;
  }

  public void result(String name, char guessResult){
    if (guessResult == '='){
      System.out.println(name + " угадал!");
    } else if (guessResult == '>'){
      System.out.println(name + " назвал число >, чем загадал компьютер.");
    } else if (guessResult == '<'){
      System.out.println(name + " назвал число <, чем загадал компьютер.");
    }
  }
}
