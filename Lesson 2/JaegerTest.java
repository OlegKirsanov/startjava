import java.util.Scanner;

public class JaegerTest {
  public static void main(String[] args) {
    Jaeger jaegerOne = new Jaeger("Coyote Tango", "Mark-1", "Japan", 85.34f, 2.31f, 5, 7);
    Jaeger jaegerTwo = new Jaeger("Striker Eureka", "Mark-5", "Australia", 76.2f, 1.85f, 10, 10);

    Scanner in = new Scanner(System.in);

    jaegerOne.showSpecs();
    System.out.println("Допустить робота к бою? [да/нет]: ");
    if (in.next().equals("да")) {
      jaegerOne.loadArm();
      jaegerOne.usePowerMove();
      jaegerOne.useMissile();
      jaegerOne.killKaiju();
      System.out.println("");
    }

    jaegerTwo.showSpecs();
    System.out.println("Допустить робота к бою? [да/нет]: ");
    if (in.next().equals("да")) {
      jaegerTwo.loadArm();
      jaegerTwo.usePowerMove();
      jaegerTwo.useMissile();
      jaegerTwo.killKaiju();
    }

    in.close();
  }
}
