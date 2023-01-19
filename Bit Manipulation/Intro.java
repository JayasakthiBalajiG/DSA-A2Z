public class Intro {
    public static void main(String[] args) {
        int num = 7;
        int pos =4;
        int bitMask = 1<<pos;

        int nnum = bitMask & num;
        System.out.println(nnum);
        
        if((bitMask & num) ==0){
            System.out.println("zero");
        }
        else
            System.out.println("one");
    }
}
