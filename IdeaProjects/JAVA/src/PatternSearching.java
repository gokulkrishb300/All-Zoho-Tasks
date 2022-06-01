public class PatternSearching {
    private static boolean ismatch(int[] alpha,int[] beta){
        for(int i=0;i<26;i++){
            if(alpha[i]!=beta[i]){
                return false;
            }
        }
        return true;
    }
    private static int set(String str,String str1){
        int[] alpha=new int[26];
        int[] beta=new int[26];
        int i=0;
        for( i=0;i<str1.length();i++){
            alpha[str.charAt(i)-'A']++;
            beta[str1.charAt(i)-'A']++;
        }
        for( i=0;i<str.length()-str1.length();i++){
            if(ismatch(alpha,beta)){
                return i;
            }
            else{
                alpha[str.charAt(i)-'A']--;
                alpha[str.charAt(str1.length()+i)-'A']++;
            }
        }
        if(ismatch(alpha,beta)){
            return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        String str="ABCDEFG",str1="DFE";
        System.out.println(set(str,str1));
    }
}
