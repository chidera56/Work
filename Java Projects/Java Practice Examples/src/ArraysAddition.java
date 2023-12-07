public class ArraysAddition {
    public static void main(String[] args) {
        int myarr[] = { 1, 2, 3 };
        int sum = 0;

        for (int a : myarr) {
            sum += a;
        }

        System.out.println("The sum is: " + sum);
    }
}
