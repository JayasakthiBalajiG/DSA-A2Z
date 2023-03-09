public class StackStartFunction {
    public static void main(String[] args) {
        RandStack rs = new RandStack(5);
        rs.push(7);
        rs.push(9);
        rs.push(4);
        rs.push(2);
        rs.push(8);
        //rs.push(10);
        for(int i=0; i<5;i++){
            System.out.println(rs.pop());
        }
    }
}
    class RandStack{
        int arr[];
        int top;
        int data;
        int size;

        RandStack(int size){
            this.size = size;
            arr = new int[size];
            top = -1;
        }
        public void push(int data){
            if(top == arr.length){
                System.out.println("The stack is full");
            }
            else{
                arr[++top] = data;
            }
        }

        public int pop(){
            if(top<0){
                System.out.println("The stack is empty");
                return -1;
            }
            else{
                return arr[top--];
            }
        }
        
    }

