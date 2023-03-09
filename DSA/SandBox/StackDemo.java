import java.util.*;
public class StackDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Size");
        int size = sc.nextInt();
        int data;

        StackTry sr = new StackTry(size);

        for(int i=0; i<size;i++ ){
            data = sc.nextInt();
            sr.push(data);
        }
        
        System.out.println();
        for (int i = 0; i<size;i++){
            sr.pop();
        }
    }
}

class StackTry{
    int data;
    int top;
    int arr[];
    int size;

    StackTry(int size){
        this.size = size;
        arr = new int[size];
        top=-1;
    }

    void push(int data){
        this.data = data;
        if(top == arr.length){
            System.out.println("full");
        }
        else{
            arr[++top] = data;
        }
    }
    void pop(){
        if(top<0){
            System.out.println("empty");
        }
        else{
            System.out.println(arr[top--]);
        }
    }
}