import java.util.*;
public class CheckSort {
   public static void main(String[] args) {
    int arr[]= {12,3,4,6,4,28,24};
    int count=0;
    for(int i=0;i<arr.length;i++){
        if(arr[arr.length-2]>arr[arr.length-1]){
            count++;
        }
    }
    if(count!=0){
        System.out.println("no");
    }
   } 
}

//This is not correct