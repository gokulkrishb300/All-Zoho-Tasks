public class Permutation {
    private static String swap(String str,int i,int j){
        char[] charArray=str.toCharArray();
        char temp=charArray[j];
        charArray[j]=charArray[i];
        charArray[i]=temp;
        return String.valueOf(charArray);
    }
    private static void permute(String str,int i,int j){
        if(i==j){
            System.out.println(str);
        }
        else{
            for(int k=i;k<=j;k++){
                str=swap(str,i,k);
                permute(str,i+1,j);
                str=swap(str,i,k);
            }
        }
    }
    public static void main(String[] args) {
        String str="ABC";
        permute(str,0,str.length()-1);
    }
}
