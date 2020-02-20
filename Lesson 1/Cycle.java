public class ConditionalStatement {
    public static void main(String[] args) {

        for (int i = 0; i <= 20; i++){
            System.out.print(i + " ");
        }

        System.out.print("\n");

        int i = 6;
        while (i >= -6){
            System.out.print(i +" ");
            i = i - 2;
        }

        System.out.print("\n");

        int sumOdd = 0;
        i = 10;
        do {
            if (i % 2 != 0) {
                sumOdd = i + sumOdd;
            }
            i++;
        } while (i <= 20);
        System.out.print(sumOdd);

    }
}
