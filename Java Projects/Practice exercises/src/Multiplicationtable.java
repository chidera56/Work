import java.util.Scanner;

public class Multiplicationtable {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        int tablesize = 12;

        System.out.println("Enter a positve integer: ");
        int positiveinteger = userinput.nextInt();
        userinput.close();

        System.out.println("Multiplication table for " + positiveinteger);

        for(int index = 1; index <= tablesize; index++){
            int multiplicationresult = positiveinteger * index;
            System.out.println(positiveinteger + " * " + index + " = " + multiplicationresult);
        }
    }
}
