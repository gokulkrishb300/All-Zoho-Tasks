public class Ironman {
    public static void main(String[] args) {
        String str="I am :ironnorI Ma, i";
        char[] arr=str.toCharArray();
        int i=0,j=0,k=str.length()-1,count=0,count1=0,count2=0;
        while(i<str.length()){
            if(arr[i]>='A' && arr[i]<='Z'){
                arr[i]=(char)(((int)(arr[i]))+32);
            }
            if(arr[k]>='A' && arr[k]<='Z'){
                arr[k]=(char)(((int)(arr[k]))+32);
            }
            if((arr[i]==arr[k])&&(arr[i]>='a' && arr[i]<='z')){
                count++;
                i++;k--;
            }
            else {
                if (arr[i] < 'a' || arr[i] > 'z') {
                    i++;
                    count1++;
                }
                if (arr[k] < 'a' || arr[k] > 'z') {
                    k--;
                    count2++;
                }
            }

        }
        if(((str.length())-count1)==count){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
