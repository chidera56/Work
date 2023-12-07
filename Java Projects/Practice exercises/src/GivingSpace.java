import java.util.Scanner;

public class GivingSpace {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);

        System.out.println("Enter six non negative numbers: ");
        int inputNumber = userinput.nextInt();
        userinput.close();

        int number1 = inputNumber/100000%10;
        int number2 = inputNumber/10000%10;
        int number3 = inputNumber/1000%10;
        int number4 = inputNumber/100%10;
        int number5 = inputNumber/10%10;
        int number6 = inputNumber/1%10;

        System.out.println(number1+" "+number2+" "+number3+" "+number4+" "+number5+" "+number6);
    }
    
}
