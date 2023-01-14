import java.util.*;
class Concatenation {
    public static void main(String[] args) {
        int arr[] = {1,23,4,5,67};
        int arr1[] = new int [arr.length];
        arr1 = arr;

        for (int i : arr1) {
            System.out.println(i);  
        }
        int tot[] = new int[arr.length+arr1.length];
        System.arraycopy(arr,0,tot,0,arr.length);
        System.arraycopy(arr1,0,tot,arr.length,arr1.length);

        System.out.println(Arrays.toString(tot));

        // System.out.print("[");
        // for(int i=0; i<tot.length;i++){
        //     System.out.print(tot[i]+ ",");
        // }
        // System.out.println("]");
        
        // for (int i : tot) {
        //     System.out.println(i);
        // }
    }
}