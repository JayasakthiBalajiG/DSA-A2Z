import java.util.*;

public class LinkedListStart {
    public static void main(String[] args) {
        LinkedList <Integer> lk = new LinkedList<>();

        lk.add(3);
        lk.add(7);
        lk.add(20);
        lk.add(8);
        lk.add(7);
        lk.add(2, 10);

        lk.remove();
        lk.remove(3);
        lk.removeFirst();
        lk.removeLast();

        Iterator it = lk.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println();
        System.out.println("Size is : " + lk.size());

        boolean bool = lk.contains(10);
        System.out.println(bool);
        if(lk.contains(8)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }


        //Stack to linked list

        Stack <String> stk  = new Stack<>();
        LinkedList <String> lk2 = new LinkedList<>();
        stk.push("Hi");
        stk.push("GJSB");

        lk2.addAll(stk);
        System.out.println("Stack : " + stk);
    

        Iterator it2 = lk2.iterator();
        while(it2.hasNext()){
            System.out.print(it2.next() + " ");
        }

    }
}
