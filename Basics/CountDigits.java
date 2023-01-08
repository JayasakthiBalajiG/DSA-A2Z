public class CountDigits {
    public static void main(String[] args) {
        int num = 1234567890;
        
        String str = Integer.toString(num);
        System.out.println(str.length());
        
        int count = 0;
        while(num!=0){
            num = num/10;
            count++;
        }
        System.out.println(count);
    }
}
