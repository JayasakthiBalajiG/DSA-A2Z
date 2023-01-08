public class MissingElements {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,1,5};
        int temp[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;i++){
                if(j==i){
                    temp[i]=j;
                }
            }
            System.out.println(temp[i]);
        }
    }
}
