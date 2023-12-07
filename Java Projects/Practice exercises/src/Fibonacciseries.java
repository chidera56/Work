import java.util.Scanner;

public class Fibonacciseries {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);

        int num;
        int firstTerm = 0, secondTerm = 1, thirdTerm;

        System.out.println("Enter number of terms you want in the fibonacci series: ");
        num = userinput.nextInt();
        userinput.close();

        System.out.print(firstTerm+ " " +secondTerm+ " ");

        for(int index = 3; index <= num; index++){
            thirdTerm = firstTerm + secondTerm;
            System.out.print(thirdTerm+" ");
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
        }
    }
}
