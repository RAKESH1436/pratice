import java.util.Arrays;
import java.util.Scanner;

public class s{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int array[] = {10, 20, 25, 63,55,99, 96, 57};
        int size = array.length;
        Arrays.sort(array);
        System.out.println("sorted Array ::"+Arrays.toString(array));
        System.out.println("enter the second number");
        int res = array[size-3];
        System.out.println("2nd largest element is ::"+res);
    }
}