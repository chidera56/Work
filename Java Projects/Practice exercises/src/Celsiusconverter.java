import java.util.Scanner;

public class Celsiusconverter {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);

        System.out.println("Enter a Fahrenheit degree: ");
        double fahrenheit = userinput.nextDouble();
        userinput.close();

        double celsius = 5*(fahrenheit - 32)/9;
        System.out.println("The celsius for the fahrenheit degree you entered is: " +celsius);
    }
}
