public class SumCalculation {
    public static void main(String[] args) {
        int firstTennatNumbers = 10;
        int sum = 0;

        for(int index = 1; index <= firstTennatNumbers; index++ ){
            sum += index;
        }

        System.out.println("The sum of the first 10 natural numbers is: " +sum);
    }
}
