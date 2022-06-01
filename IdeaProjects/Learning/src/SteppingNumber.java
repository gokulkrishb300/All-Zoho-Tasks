public class SteppingNumber {
    public static void main(String[] args) {
        int n=0,m=100;
        String str="";
        int ch,ch1,count=1;
        for(int i=n;i<=m;i++){
            if(i>=0 && i<10) {
                System.out.print(i+" ");
            }
            else{
                str=str+i;
                for(int j=1;j<str.length();j++) {
                    ch = str.charAt(j) - '0';
                    ch1 = str.charAt(j - 1) - '0';
                    ch -= ch1;
                    if (ch == 1 || ch == -1) {
                        count++;
                    }
                }
                if(count==str.length()){
                    System.out.print(i+" ");
                }
                count=1;
                str="";
            }
        }
    }
}
