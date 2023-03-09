import java.util.*;
class QueueArray{
    int front_Q, rear_Q;
    int capacity;
    static int q[];

    QueueArray(int size){
        this.capacity = size;
        q = new int [capacity];
    }

    void enqueue (int val){
        if(rear_Q == capacity){
            System.out.println("The queue is full...");
        }
        else{
            q[rear_Q] = val;
            rear_Q++;
        }
    }
    void dequeue (){
        if(rear_Q == 0){
            System.out.println("Queue is empty");
        }
        else{
            for(int i=0;i<rear_Q-1;rear_Q++){
                q[i] = q[i+1];
            }
            rear_Q--;
        }
    }
    void display(){
        if (rear_Q==0){
            System.out.println("Queue is empty");
        }
        else{
            for(int i=0;i<rear_Q;i++){
                System.err.print(q[i] + " " );
            }
        }
    }
}

public class QueueStart {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //System.out.println("Enter the max size : ");
        //int max = sc.nextInt();
        QueueArray qA = new QueueArray(5);
        qA.enqueue(2);
        qA.enqueue(5);
        qA.enqueue(8);
        //qA.enqueue(9);
        qA.display();
        qA.dequeue();
        System.out.println();
        qA.display();
    }
}
