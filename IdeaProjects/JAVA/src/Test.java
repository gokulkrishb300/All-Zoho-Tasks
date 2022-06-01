import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        int count=0;
        Scanner obj=new Scanner(System.in);
        String str="AComputerSciencePortalForGeeks";
        for(int i=0;i<str.length();i++){
            if((str.charAt(i)>='A' && str.charAt(i)<='Z')&&(str.charAt(i+1)>='A' && str.charAt(i+1)<='Z')){
                System.out.println(str.charAt(i));
            }
            else if((i<str.length()-1)&&(str.charAt(i+1)>='A' && str.charAt(i+1)<='Z')){
                System.out.print(str.charAt(i));
                System.out.println();
            }
            else {
                System.out.print(str.charAt(i));
            }
        }
    }

}