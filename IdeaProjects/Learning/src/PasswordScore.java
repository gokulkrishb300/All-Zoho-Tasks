public class PasswordScore {
    static boolean lower,upper,digit,special_character;
    public static void main(String[] args) {
        String str="Password10";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a'&& str.charAt(i)<='z') {
                lower=true;
            }
            if(str.charAt(i)>='A'&& str.charAt(i)<='Z'){
                upper=true;
            }
            if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                digit=true;
            }
            if(str.charAt(i)=='!' || str.charAt(i)=='@' || str.charAt(i)=='#' ||
                    str.charAt(i)=='$' || str.charAt(i)=='%' ||
                    str.charAt(i)=='&' || str.charAt(i)=='^' || str.charAt(i)=='*' ||
                    str.charAt(i)=='(' || str.charAt(i)==')' || str.charAt(i)=='-' ||
                    str.charAt(i)=='+'){
                special_character=true;
            }
        }
        System.out.println((lower?2:0)+(upper?2:0)+(digit?2:0)+((str.length()>=8 && str.length()<10)?1:0)+((str.length()>=10)?2:0)+(special_character?2:0));
    }
}
