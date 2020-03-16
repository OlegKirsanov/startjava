package com.startjava.lesson_2_3.game;

import java.util.Scanner;

public class GuessNumberTest {
  public static void main(String[] args) {
    GuessNumber testGame = new GuessNumber();
    Player player1 = new Player();
    Player player2 = new Player();
    Scanner in = new Scanner(System.in);
    int compNum;
    String answer = "да";
    System.out.println("Добро пожаловать в игру GuessNumber!");
    while (answer.equals("да")) {
      System.out.print("Введите имя 1-го игрока: ");
      player1.setName(in.next());
      System.out.print("Введите имя 2-го игрока: ");
      player2.setName(in.next());
      compNum = testGame.generateNum(1, 100);
      System.out.println("Компьютер загадал число от 1 до 100 (по секрету это " + compNum + ")");
      System.out.println("У вас есть 10 попыток, чтобы угадать число.");
      //guessed - флаг "угадал кто-то из игроков или нет"
      // i - счетчик попыток угадываний
      boolean[] guessed = {false, false};
      for (int i = 0; i < 10; i++){
        if (!guessed[0] && !guessed[1]) {
          System.out.println(player1.getName() + ", ваш вариант:");
          player1.setNum(in.nextInt(), i);
          System.out.println(player2.getName() + ", ваш вариант:");
          player2.setNum(in.nextInt(), i);
          guessed[0] = player1.printResult(compNum);
          guessed[1] = player2.printResult(compNum);
          System.out.println("");
        }
      }
      player1.printStats();
      System.out.println("");
      player2.printStats();
      System.out.println("");
      do {
        System.out.print("Хотите продолжить? [да/нет]: ");
        answer = in.next();
      } while (!answer.equals("да") && !answer.equals("нет"));
    }
  }
}