import java.util.*;
public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int rowMax = sc.nextInt();
        System.out.println("Enter the number of col : ");
        int colMax = sc.nextInt();
        int arr[][] = new int [rowMax][colMax];
        System.out.println("Enter the elements of the row and column : ");
        for(int i = 0; i<rowMax;i++){
            for(int j=0;j<colMax;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The array : ");
        for(int i =0; i<rowMax;i++ ){
            for(int j =0;j<colMax;j++){
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
