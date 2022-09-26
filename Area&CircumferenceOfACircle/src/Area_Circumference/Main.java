package Area_Circumference;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int option;
        int radius = 0;

        Scanner sc = new Scanner(System.in);

        Area_Circumference Area_Circumference = new Area_Circumference(radius);

        try{
            System.out.println("Would you like to calculate the area or circumference of a circle?");
            System.out.println("1. Area");
            System.out.println("2. Circumference");
            
        }catch(Exception e) {
            System.out.println("Wrong option!!!!");
        }
            option = sc.nextInt();

        switch(option){
            case 1:
                System.out.println("Enter the radius of the circle: ");
                Area_Circumference.radius = sc.nextInt();
                System.out.println("The area of the circle is: " +Area_Circumference.calculateArea());
                break;

            case 2:
                System.out.println("Enter the radius of the circle: ");
                Area_Circumference.radius = sc.nextInt();
                System.out.println("The circumference of the circle is: " +Area_Circumference.calculateCircumference());
                break;
            
            default:
                System.out.println("Invalid option!");
        }
        sc.close();
    }
}

