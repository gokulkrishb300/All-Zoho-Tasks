import java.util.Scanner;

public class Repeating {
    public static void main(String[] args) {
        int[] arr=new int[26];
        int result=0;
        String str;
        Scanner obj=new Scanner(System.in);
        str=obj.next();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if((arr[i]>=max)){
                max=arr[i];
                System.out.println(i);
                result=i;
            }
        }
        System.out.print((char)(result+97));
    }
}
