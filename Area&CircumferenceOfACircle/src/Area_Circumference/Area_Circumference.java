package Area_Circumference;

/**
 * 
 * @author Chidera
 */

import java.util.Scanner;

public class Area_Circumference {
    public static String calculateCircumference;

    public static String calculateArea;

    int radius;

    Scanner sc = new Scanner(System.in);

    public Area_Circumference(int radius){
        this.radius = radius;
    }
    
    public double calculateArea(){
        double area = 3.14 * (radius * radius);
        return area;
    }

    public double calculateCircumference(){
        double circumference = 2 *(3.14 * radius);
        return circumference;
    }

    int getRadius(){
        return radius;
    }

    void setRadius(int radius){
        this.radius = radius;
    } 

}
