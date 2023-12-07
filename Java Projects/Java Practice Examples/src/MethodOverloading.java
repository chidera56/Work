class Adder{

    //Method overloading: changing no. of arguments.
    static int Add(int i, int j){
        return i+j;
    }

    static int Add(int i, int j, int k){
        return i+j+k;
    }

    public static void main(String[] args) {
        System.out.println(Add(5, 5));
        System.out.println(Add(5, 5, 5));
    }
}

public class MethodOverloading {
    
    //Method overloading: Chaning data type of arguments.
    static int Add(int a, int b, int c){
        return a+b+c;
    }

    static double Add(double a, double b, double c){
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println(Add(10, 10, 10));
        System.out.println(Add(10.1, 10.2, 10.3));
    }
}

