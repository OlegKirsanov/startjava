import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    boolean isCorrect = false;
    int pcNum = 12;

    while (isCorrect == false) {
		System.out.println("Введите число: ");
	    int userNum = in.nextInt();
		if (userNum == pcNum) {
	    	System.out.println("Вы угадали!");
	    	isCorrect = true;
	    } else if (userNum > pcNum) {
	    	System.out.println(1"Введенное вами число больше того, что загадал компьютер");
	    	isCorrect = false;
	    } else if (userNum < pcNum) {
	    	System.out.println("Введенное вами число меньше того, что загадал компьютер");	
	    	isCorrect = false;
	    }
    }    
  	in.close();
  	}
}
