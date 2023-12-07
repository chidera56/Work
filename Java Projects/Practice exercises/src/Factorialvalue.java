import java.util.Scanner;

public class Factorialvalue {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        int number;
        int factorial = 1;

        System.out.println("Enter a number: ");
        number = userinput.nextInt();
        userinput.close();

        for(int index = 1; index <= number; index++){
            factorial*= index;
        }

        System.out.println("The factorial value of " + number + " is " + factorial);
    }
}
