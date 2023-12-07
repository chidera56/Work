import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);

        System.out.println("Enter the first integer: ");
        int integer1 = userinput.nextInt();

        System.out.println("Enter the second integer: ");
        int integer2 = userinput.nextInt();
        userinput.close();

        int sum = integer1 + integer2;
        System.out.println("The sum will be: " + sum);

        int difference = integer1 - integer2;
        System.out.println("The difference will be: " + difference);

        int product = integer1 * integer2;
        System.out.println("The product will be: " + product);

        double average = (integer1 + integer2) / 2;
        System.out.println("The average will be: " + average);

        int distance = Math.abs(integer1 - integer2);
        System.out.println("The distance will be: " + distance);

        int maxinteger = Integer.MIN_VALUE;
        if (integer1 > maxinteger) {
            maxinteger = integer1;
        }
        if (integer2 > maxinteger) {
            maxinteger = integer2;
        }

        System.out.println("The maximum integer will be: " + maxinteger);

        int mininteger = Integer.MAX_VALUE;
        if (integer1 < mininteger) {
            mininteger = integer1;
        }
        if (integer2 < mininteger) {
            mininteger = integer2;
        }

        System.out.println("The minimum integer will be: " + mininteger);

    }
}
