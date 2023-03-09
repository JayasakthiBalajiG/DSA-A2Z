import java.util.*;
public class LinkedListTry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch="";
        LinkedList lk = new LinkedList();
        do{
            System.out.println("Enter the value");
            int num = sc.nextInt();
            lk.add(num);
            System.out.println("Do you want to add another node?Type Yes/No");
            ch=sc.nextLine();
        }while(ch.equals("Yes"));

    }
}
