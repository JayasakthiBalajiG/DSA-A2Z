import java.util.*;
public class StackFuctionTry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size :");
        int size = sc.nextInt();
        StackRand sr = new StackRand(size);
        sr.push(21);
        sr.push(24);
        sr.push(13);
        sr.push(45);
        sr.push(50);
        for (int i = 0; i<size;i++){
            sr.pop();
        }
    }
}

class StackRand{
    int data;
    int top;
    int arr[];
    int size;

    StackRand(int size){
        this.size = size;
        arr = new int[size];
        top =-1;
    }

    void push(int data){
        if(top == arr.length){
            System.out.println("The stack is full");
        }
        else{
            arr[++top] = data;
        }
    }
    void pop(){
        if(top<0){
        System.out.println("The stack is empty");
        }
        else{
            System.out.println(arr[top--]);
        }
    }
}
