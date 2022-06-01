public class FindRotate {
    public static void main(String[] args) {
        String str="mightandmagic",substring="andmagicmigth";
        int index=0,count=0;
        for(int i=0;i<str.length();i++){
            if(substring.charAt(0)==str.charAt(i)){
                index=i;
                break;
            }
            else if(substring.charAt(0)==(char)((((int)(str.charAt(i)))+32))){
                index=i;
                break;
            }
            else if(substring.charAt(0)==(char)((((int)(str.charAt(i)))-32))){
                index=i;
                break;
            }
        }
        for(int i=0;i<str.length();i++){
            if(substring.charAt(i)==str.charAt((index+i)%(str.length()))){
                count++;
            }
            else if(substring.charAt(i)==(char)((((int)(str.charAt((index+i)%(str.length()))))+32))){
                count++;
            }
            else if(substring.charAt(i)==(char)((((int)(str.charAt((index+i)%(str.length()))))-32))){
                count++;
            }
        }
        //System.out.println(count);
        if(count==str.length()){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}
