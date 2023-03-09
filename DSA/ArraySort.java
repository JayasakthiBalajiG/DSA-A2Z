import java.util.*;
public class ArraySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the max : ");
        int max = sc.nextInt();
        int arr[] = new int[max];
        System.out.println("Enter the array values : ");
        for(int i=0;i<max;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The array : ");
        for(int i=0; i<max;i++){
            System.out.println(arr[i]);
        }
        System.out.println("The sorted array :");
        //Arrays.sort(arr); using function

        int greater;
        for(int i=0;i<max;i++){
            for(int j=i+1;j<max;j++){
                if(arr[i]>arr[j]){
                    greater = arr[i];
                    arr[i]=arr[j];
                    arr[j] = greater;
                }
            }
        }

        for(int i=0;i<max;i++){
            System.out.println(arr[i]);
        }
    }
}
