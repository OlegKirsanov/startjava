import java.util.Scanner;

public class GuessNumber {
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
      System.out.println("Ответ: " + (num1 ^ num2));
    } else if (oper == '%') {
      System.out.println("Ответ: " + (num1 % num2));
    }

  in.close();

  }
}
