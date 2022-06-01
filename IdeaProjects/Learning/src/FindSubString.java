public class FindSubString {
    public static void main(String[] args) {
        String str="GeeksfogeeksFor", substring ="for";
        int count=0,k=0,result=-1;
        for(int i=0;i<str.length();i++){
            if(substring.charAt(k)==(str.charAt(i))){
                count++;
                k++;
                if(count== substring.length()) {
                    result=i;
                    break;
                }
            }
            else if(substring.charAt(k)==(char)((((int)(str.charAt(i)))+32))){
                count++;
                k++;
                if(count== substring.length()) {
                    result=i;
                    break;
                }
            }
            else if(substring.charAt(k)==(char)((((int)(str.charAt(i)))-32))){
                count++;
                k++;
                if(count== substring.length()) {
                    result=i;
                    break;
                }
            }
            else{
                count=0;
                k=0;
            }
        }
        result=result+1-count;
        if(result>0){
            System.out.println(result);
        }
        else{
            System.out.println("-1");
        }

    }
}
