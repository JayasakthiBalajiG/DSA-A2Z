import java.util.*;
public class Array1D{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max;
        System.out.println("Enter the max limit : ");
        max = sc.nextInt();
        int arr[] = new int[max];
        System.out.println("Enter the numbers : ");
        for(int i=0;i<max;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The numbers : ");
        for(int i = 0; i<max;i++){
            System.out.println(arr[i]);
        }
        int arr1[] = {1,2,3};
        for(int i=0;i<3;i++){
            System.out.println(arr1[i]);
        }
    }
}