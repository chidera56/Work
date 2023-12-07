public class FindMinimumValueInArray {

    public static int findminvalue(int myarr[]) {
        int minimun = myarr[0];

        for (int a = 0; a < myarr.length; a++) {
            if (myarr[a] < minimun) {
                minimun = myarr[a];
            }
        }
        return minimun;
    }

    public static void main(String[] args) {
        int myarr[] = { 2, 4, 6, 8, 9, 12, 25, 40, 0 };

        System.out.println(findminvalue(myarr));
    }
}
