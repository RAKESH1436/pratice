public class r_factorial {
//    static int fact(int n) {
//        if (n==1)
//            return 1;
//        else
//            return (n * fact(n-1));
//    }
//
//    public static void main(String[] args) {
//        System.out.println("factorial "+fact(5));
    //}
    static  int fact(int x){
        if (x==1)
            return 1;
        else
            return (x * fact(x-1));
    }

    public static void main(String[] args) {
        System.out.println("fac"+fact(5));

    }
}
