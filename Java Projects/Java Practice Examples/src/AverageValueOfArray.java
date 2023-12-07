public class AverageValueOfArray {
    public static void main(String[] args) {
        int[] myarr = { 1, 2, 3, 4, 5, 6, 7, 8 };

        int sum = 0;

        for (int a = 0; a < myarr.length; a++) {
            sum = sum + myarr[a];
        }

        double average = sum / myarr.length;
        System.out.println("The average value of array elements is: " + average);
    }
}
