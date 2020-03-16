package com.startjava.lesson_2_3.game;

import java.util.Arrays;

public class Player {
  private String name;
  private int[] num = new int[10];
  private int index;
  private int compNum;

  public void setName(String n){
    name = n;
  }

  public String getName(){
    return name;
  }

  public void setNum(int n, int index){
    this.index = index;
    num[this.index] = n;
  }

  public boolean printResult(int compNum){
    this.compNum = compNum;
    if (num[index] == compNum){
      System.out.println(name + " угадал число " + compNum + " с " + (index + 1) + "-й попытки");
      return true;
    } else if (num[index] > compNum){
      System.out.println(name + " назвал число >, чем загадал компьютер.");
      if (index == 9) {
        System.out.println("У " + name + " закончились попытки ((");
      }
      return false;
    } else {
      System.out.println(name + " назвал число <, чем загадал компьютер.");
      if (index == 9) {
        System.out.println("У " + name + " закончились попытки ((");
      }
      return false;
    }
  }

  public void printStats(){
    int[] resultArray = Arrays.copyOf(num, index + 1);
    //Вывод результата
    System.out.print(name + " называл: ");
    for (int i:resultArray) {
      System.out.print(i + " ");
    }
    //Очистка массива
    for (int i:resultArray) {
      Arrays.fill(resultArray, 0, index, 0);
    }
  }

}
