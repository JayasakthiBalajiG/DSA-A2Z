public class QueueDemo {
    public static void main(String[] args) {
        QueueTry qt = new QueueTry(5);
        // try enqueue and dequeue 
    }
}

class QueueTry{
    int front;
    int rear;
    int size;
    int data;
    int arr[];

    QueueTry(int size){
        arr = new int[size];
        this.size = size;
    }

    void enQueue(int data){
        this.data = data;
        if(rear == size){
            System.out.println("full");
        }
        else{
            arr[rear] = data;
            rear++;
        }
    }

    void deQueue(){
        if(rear == 0){
            System.out.println("empty");
        }
        else{
            for(int i=0;i<rear;rear++){
                arr[i]=arr[i+1];
            }
            rear--;
        }
    }
    void display(){
        if(rear == 0){
            System.out.println("empty");
        }
        else{
            for(int i=0;i<rear;i++){
                System.out.println(arr[i]);
            }
        }
    }
}
