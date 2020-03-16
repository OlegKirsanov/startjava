package com.startjava.lesson_2_3.game;

import java.lang.Math;

public class GuessNumber {

  public int generateNum(int min, int max){
    int range = max - min + 1;
    return (int)(Math.random() * range) + min;
  }

}
