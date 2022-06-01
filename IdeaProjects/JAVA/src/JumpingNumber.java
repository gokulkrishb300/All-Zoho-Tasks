public class JumpingNumber {
    static String result="",str="";
    static  int num1,count,temp;
    private static void fun(int n,int m){
        int num=(n*10)+m;
        if(count==0) {
            if (((n * 10) + (n + 1)) <= num) {
                result = result + ((n * 10) + (n + 1));
                count++;
                temp=m;
            } else if (((n - 1) * 10) + n <= num) {
                result=result+(((n - 1) * 10) + n);
                count++;
                temp=m;
            }
        }
        else{
            if (((n * 10) + (n + 1)) <= num) {
                result = result + m;
            } else if (((n - 1) * 10) + n <= num) {
                result=result+m;
            }
        }

        }
        public static void main (String[]args){
            num1=2314;str += num1;temp=str.charAt(0) - '0';
            for (int i = 1; i < str.length(); i++) {

                fun(temp, str.charAt(i) - '0');
            }
            System.out.println(result);

        }
    }
