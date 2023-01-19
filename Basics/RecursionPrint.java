class RecursionPrint {
    public static void main(String[] args) {
        int arr[] = {1,45,7,5,4,545,7};
        int size = arr.length;
        rec(arr,size,0);
    }

    public static void rec(int arr[],int size, int index){
        if(index<size){
            System.out.print(arr[index]+ " ");
           rec(arr, size,index+1);
        }
    }
}