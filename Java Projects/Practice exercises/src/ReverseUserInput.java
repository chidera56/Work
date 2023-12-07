import java.util.Scanner;

public class ReverseUserInput {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);

        int input;
        int reverse = 0;

        System.out.println("Enter a number: ");
        input = userinput.nextInt();
        userinput.close();

        int temporary = input;
        int remainder = 0;

        do{
            remainder = temporary%10;
            reverse = reverse * 10 + remainder;
            temporary/= 10;
        }while(temporary > 0);

        System.out.println("The reverse of " + input + " is " + reverse);
    }
}
