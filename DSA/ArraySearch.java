import java.util.*;
public class ArraySearch {
    public static void main(String[] args) {
        System.out.println("Enter the max : ");
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        int arr[] = new int[max];
        System.out.println("Enter the array elements :");
        for(int i = 0; i<max; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the search element : ");
        int find = sc.nextInt();
        int search = Search(arr,find);
        if(search ==-1){
            System.out.println("Element not found");
        }
        else
            System.out.println("The element found : "+search);
    }

    public static int Search(int arr[], int find){
        for(int i=0; i<arr.length;i++){
            if(find == arr[i]){
                return arr[i];
            }
        }
        return -1;
    }

}
