public class RemoveEvenNumbersFromArray {
    static int[] removeevennumbers(int[] myarr) {
        int oddnumbersCount = 0;

        for (int a = 0; a < myarr.length; a++) {
            if (myarr[a] % 2 != 0) {
                oddnumbersCount++;
            }
        }

        int[] result = new int[oddnumbersCount];
        int index = 0;

        for (int b = 0; b < myarr.length; b++) {
            if (myarr[b] % 2 != 0) {
                result[index] = myarr[b];
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int myarr[] = { 2, 3, 5, 6, 8, 9, 11 };
        int myarr2[] = removeevennumbers(myarr);

        for (int c = 0; c < myarr2.length; c++) {
            System.out.print(myarr2[c] + " ");
        }
    }
}
