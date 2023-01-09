import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        int num = 515;
        int N =num;
        int rev=0;
        while(num !=0){
            int d = num%10;
            rev = rev*10+d;
            num = num/10;
        }
        System.out.println(N);
        System.out.println(rev);
        if(N==rev){
            System.out.println("yes");
        }
        else
            System.out.println("no");



        String str = "mam";
        char strArr[] = str.toCharArray();
        for(int i =0; i<strArr.length;i++){
            System.out.print(strArr[i]);
        }
        System.out.println();
        for (int i=strArr.length-1;i>=0;i--){
            System.out.print(strArr[i]);
        }


        
        StringBuffer strBuff = new StringBuffer(str);
        strBuff.reverse();
        boolean res = str.contentEquals(strBuff);
        System.out.println();
        System.out.println(res);
    }
}
