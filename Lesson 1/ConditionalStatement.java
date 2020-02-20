public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 18;
        String sex = "female";
        double height = 1.83;
        String name = "Oleg";

        if(age > 20){
            System.out.println("Adult");
        }

        if(sex == "male"){
            System.out.println("Man");
        }

        if(sex != "male"){
            System.out.println("Woman");
        }

        if(height < 1.80){
            System.out.println("Not too tall");
        } else {
            System.out.println("Quite tall");
        }


        if (name.substring(0, 1).equals("M")) {
            System.out.println("The name starts from 'M'");
        } else if (name.substring(0, 1).equals("I")){
            System.out.println("The name starts from 'I'");
        } else{
            System.out.println("The name starts neither from 'M' nor 'I'");
        }

    }
}
