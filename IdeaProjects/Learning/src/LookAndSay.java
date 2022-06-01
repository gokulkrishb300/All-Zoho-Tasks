public class LookAndSay {
    public static void main(String[] args) {
        int N=4,count=0;
        String str="11",temp="";
        char c='\0';
        for(int i=2;i<N;i++){
            if(N==1){
                System.out.println("1");
                break;
            }
            if(N==2){
                System.out.println("11");
                break;
            }
            for(int j=0;j<str.length();j++){
                if(j==0){
                    c=str.charAt(0);
                }
                if(c==str.charAt(j)){
                    count++;
                }
                if(c!=str.charAt(j)){
                    temp=temp+count+c;
                    count=1;
                    c=str.charAt(j);
                }
                if(j==str.length()-1){
                    temp=temp+count+c;
                }
            }
            str=temp;
            count=0;
            temp="";


        }
        System.out.println(str);
    }
}
