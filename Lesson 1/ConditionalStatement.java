public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 36;
        String sex = "male";
        float height = 1.83;
        String name = "Oleg";
        char firstLetter = name.charAt(0);

        if(age > 20){
            System.out.print("Adult");    
        }

        if(sex == "male"){
            System.out.print("A man");
        } 

        if(sex != "male"){
            System.out.print("A woman");
        }
        
        if(height < 1.80){
            System.out.print("Not too tall");
        } else if{
            System.out.print("Quite tall");
        }

        if(firstLetter.equals("M")) {
            System.out.print("Name starts from 'M'");
        } else if(firstLetter.equals("I")){
            System.out.print("Name starts from 'I'");
        } else{
            System.out.print("Name starts neither from 'M' nor 'I'");
        }

    }
}
