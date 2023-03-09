import java.util.*;
public class StackStart {
    public static void main(String[] args) {
        Stack <Integer> stk = new Stack<>();
        
        stk.push(5);
        stk.push(2);
        stk.push(1);
        stk.push(4);
        System.out.println(stk);

        stk.pop();
        System.out.println(stk);

        System.out.println(stk.peek());

        System.out.println(stk.isEmpty());

        System.out.println(stk.search(8));

        System.out.println(stk.size());

    }
}
