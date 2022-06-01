public class Concate {
    public static void main(String[] args) {
        String a="amazon",b="azonam";
        a=a+a;
        int k=0,count=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)==b.charAt(k)){
                k++;
                count++;
            }
            else{
                k=0;
                count=0;
            }
            if(count==b.length()){
                System.out.println("Strings are rotated");
                break;
            }
        }

    }
}
