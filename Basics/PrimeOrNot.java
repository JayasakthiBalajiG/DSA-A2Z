public class PrimeOrNot {
    public static void main(String[] args) {
        int num = 70;
        int count =0;
        for(int i=2;i<num;i++){
            if(num%i==0)
            count=1;
        }
        if(count == 1)
        System.out.println("Not a prime");
        else
        System.out.println("Prime number");
    }
}
 