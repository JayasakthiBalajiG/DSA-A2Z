class LargestElementArray {
    public static void main(String[] args) {
        int arr[] = {1,34,45,33,88};
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);
    }
}