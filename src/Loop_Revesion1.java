import java.util.Scanner;

public class Loop_Revesion1 {
    //private static String str;
    //private static int userIntInput;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //str = "string";
        //userIntInput = 0;
        boolean inputCheck = true;

        while (inputCheck) {
            if (input.hasNext()) {
                String str = input.nextLine();
                if (!str.equals("end")) {
                    System.out.println("the string you enter is: " + str);
                    System.out.println("please enter new String,enter end to stop the app");
                    //str = input.nextLine();
                } else {
                    inputCheck = false;
                    System.out.println("tys for using our app");
                }
            }else if(input.hasNextInt()){
                int userIntInput = input.nextInt();
                //userIntInput = input.nextInt();
                System.out.println("the number you enter is: " + userIntInput);
                System.out.println("please enter new String or number,enter end to stop the app");
            }

        }
    }
}