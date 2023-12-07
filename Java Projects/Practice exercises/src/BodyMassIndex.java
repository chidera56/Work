import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);

        System.out.println("Enter your weight in pounds: ");
        double weightinpounds = userinput.nextDouble();

        System.out.println("Enter your height in inches: ");
        double heightInInches = userinput.nextDouble();
        userinput.close();

        double BMI = weightinpounds * 0.4535/(heightInInches*0.0254*heightInInches*0.0254);

        System.out.println("Your body mass index is "+BMI);
    }
}
