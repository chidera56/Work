public class PrintGridUsingArray {
    public static void main(String[] args) {
        int[][] myarr = new int[10][10];

        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                System.out.print(myarr[a][b]);
            }

            System.out.println();
        }
    }
}
