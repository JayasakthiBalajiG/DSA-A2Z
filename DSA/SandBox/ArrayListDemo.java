import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> al = new ArrayList<>();

        int data;
        int size = sc.nextInt();
        for(int i=0;i<size;i++){
            data = sc.nextInt();
            al.add(data);
        }

        System.out.println(al.toString());

        Collections.sort(al);

        System.out.println();
        for(int i=0;i<size;i++){
            System.out.println(al.get(i));
        }
    }
}
