import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator testCalc = new Calculator();
        boolean repeat = true;
        String answer;
        boolean correctAnswer;
        Scanner in = new Scanner(System.in);

        while (repeat == true) {
            System.out.println("");
            System.out.println("Введите первое число: ");
            testCalc.setNum1(in.nextInt());

            System.out.println("Введите второе число: ");
            testCalc.setNum2(in.nextInt());

            System.out.println("Введите знак математической операции: ");
            testCalc.setOper(in.next().charAt(0));

            testCalc.getResult();

            System.out.println("");
            correctAnswer = false;
            System.out.println("Хотите продолжить? [да/нет]: ");
            while (correctAnswer == false) {
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
