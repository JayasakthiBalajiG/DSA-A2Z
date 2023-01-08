import java.util.*;
class GetUnion {
    public static void main(String[] args) {
        int arr[] = {1,4,48,56,48,4,1,25,4};
        int arr1[] = {1,1,5,56,45,41,5,2,14,8};

        int arrLength = arr.length;
        int arr1Length = arr1.length;

        int tot [] = new int[arrLength+arr1Length];

        //arraycopy (obj src, src position, dest, dest position, length of the array) - to merger two arrays

        System.arraycopy(arr,0,tot,0,arrLength);
        System.arraycopy(arr1,0,tot,arrLength,arr1Length);
        System.out.print("The total array : ");
        System.out.println(Arrays.toString(tot));

        Set <Integer> set = new HashSet<>();
        Set <Integer> dset = new HashSet<>();

        for (Integer integer : tot) {
            if(!set.add(integer)){
                dset.add(integer);
            }
        }

        // int setToArr[] = new int[set.size()];
        // System.arraycopy(set.toArray(),0,setToArr,0,set.size());
        // System.out.println(setToArr);

        System.out.println();
        System.out.println("The union is : "+set);
        System.out.println();
        System.out.println(dset);
    }
}
