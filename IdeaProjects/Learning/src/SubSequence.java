public class SubSequence {
    public static void main(String[] args) {
        String str="YADXCP",substring="AXY";
        int count=0,result=0,k=0;
        for(int i=0;i<str.length();i++){
            if(substring.charAt(k)==(str.charAt(i))){
                count++;
                k++;
            }
            else if(substring.charAt(k)==(char)((((int)(str.charAt(i)))+32))){
                count++;
                k++;
            }
            else if(substring.charAt(k)==(char)((((int)(str.charAt(i)))-32))){
                count++;
                k++;
            }
        }
        if(count==substring.length()){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }

    }
}
