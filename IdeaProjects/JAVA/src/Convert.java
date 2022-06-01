import java.util.Scanner;


public class Convert {
    static int num=30;
    Scanner obj=new Scanner(System.in);
    static String[] arr={"Zero","one","two","three","four","five","six","seven","eight","nine"};
    static String[] arr1={" ","Eleven","Twelve","Thirteen","Fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
    static String[] arr2={" ","Ten","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
    //static String[] arr3={"Thousand","Hundred"};
    public static void fun1(int n){
        int a=0;
        if(n!=0){
            System.out.print(arr[n]+" "+ "Thousand"+" ");
            num=num-(1000*n);
        }
    }
    public static void fun2(int n){
        if(n!=0){
            System.out.print(arr[n]+" "+ "Hundred"+" ");
            num=num-(100*n);
        }
    }
    public static void fun3(int n){
        if(n>=0 && n<=9){
            System.out.println(arr[n]+" ");
        }
        else if(n%10==0){
            System.out.println(arr2[n/10]+" ");
        }
        else if(n>10 && n<=19){
            System.out.println(arr1[n%10]+" ");
        }
        else{
            System.out.println(arr2[n/10]+" "+arr[n%10]);
        }
    }
    public static void main(String[] args) {
        fun1(num/1000);
        fun2(num/100);
        fun3(num);
    }
}
