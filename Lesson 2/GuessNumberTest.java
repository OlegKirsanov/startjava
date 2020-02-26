import java.util.Scanner;

public class GuessNumberTest {
  public static void main(String[] args) {
    GuessNumber testGame = new GuessNumber();
    Player player1 = new Player();
    Player player2 = new Player();
    Scanner in = new Scanner(System.in);
    int num;
    boolean correctAnswer;
    boolean repeat = true;
    String answer;

    System.out.println("Добро пожаловать в игру GuessNumber!");
    System.out.println("Введите имя 1-го игрока: ");
    player1.setName(in.next());
    System.out.println("Введите имя 2-го игрока: ");
    player2.setName(in.next());
    num = testGame.generateNum(1, 100);
    System.out.println("Компьютер загадал число " + num);
    while (repeat == true){
      System.out.println(player1.getName() + ", ваш вариант:");
      player1.setNumber(in.nextInt());
      System.out.println(player2.getName() + ", ваш вариант:");
      player2.setNumber(in.nextInt());
      testGame.result(player1.getName(), player1.guess(num));
      testGame.result(player2.getName(), player2.guess(num));
      System.out.println("");
      correctAnswer = false;
      System.out.println("Хотите продолжить? [да/нет]: ");
      while (correctAnswer == false){
        answer = in.next();
        if (answer.equals("да")){
          repeat = true;
          correctAnswer = true;
        } else if (answer.equals("нет")){
          repeat = false;
          correctAnswer = true;
        }
        else {
          correctAnswer = false;
          System.out.println("Хотите продолжить? [да/нет]: ");
        }
      }
    }
    in.close();
  }
}
