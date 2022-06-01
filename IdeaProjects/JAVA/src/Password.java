import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        String str;
        Scanner obj=new Scanner(System.in);
        str=obj.next();
        int m=0,j=0,k=0,l=0,count=0,b=0;
        for(int i = 0; i <str.length(); i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                i++;
            }
            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                j++;
            }
            if(str.charAt(i)=='!' || str.charAt(i)=='@' || str.charAt(i)=='#' ||
                    str.charAt(i)=='$' || str.charAt(i)=='%' ||
                    str.charAt(i)=='&' || str.charAt(i)=='^' || str.charAt(i)=='*' ||
                    str.charAt(i)=='(' || str.charAt(i)==')' || str.charAt(i)=='-' ||
                    str.charAt(i)=='+'){
                    k++;

            }
            if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                l++;
            }
            if(str.length()>8){
                count++;
            }
            if(str.length()<=6){
                b++;
            }
        }
        if(m>0 && j>0 && k>0 && l>0 && count>0){
            System.out.println("Strong");
        }
        else if(m>0 && j>0 && k>0 && b>0){
            System.out.println("Moderate");
        }
        else System.out.println("Weak");
    }
}
