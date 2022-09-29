package application.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import Area_Circumference.Area_Circumference;


public class test {
    @Test
    public void testcalculateArea(){
        System.out.println("Calculate Area!!!");
        Area_Circumference areacircumference = new Area_Circumference(10);
        double expResult = 314;
        double result = areacircumference.calculateArea();
        assertEquals(expResult, result, .1);
    }

    @Test
    public void calculateCircumference(){
        System.out.println("Calculate Circumference!!");
        Area_Circumference areacircumference = new Area_Circumference(10);
        double expResult = 62.8;
        double result = areacircumference.calculateCircumference();
        assertEquals(expResult, result, .1);
    }
}
