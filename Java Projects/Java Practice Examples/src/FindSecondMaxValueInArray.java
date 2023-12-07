public class FindSecondMaxValueInArray {
    public static int findmaxvalue(int myarr[]) {
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;

        for (int i = 0; i < myarr.length; i++) {
            if (myarr[i] > max) {
                secondmax = max;
                max = myarr[i];
            } else if (myarr[i] > secondmax && myarr[i] != max) {
                secondmax = myarr[i];
            }
        }
        return secondmax;
    }

    public static void main(String[] args) {
        int myarr[] = { 2, 4, 5, 7, 8, 12 };

        System.out.println(findmaxvalue(myarr));
    }
}
