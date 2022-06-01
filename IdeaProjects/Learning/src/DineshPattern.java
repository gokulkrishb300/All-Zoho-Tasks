public class DineshPattern {
    public static void main(String[] args) {
        int N=6,temp=1,pre=1;
        for(int i=0;i<N;i++){
            for(int j=i;j<N;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                if(j==0&&i==0){
                    System.out.print(temp+" ");
                    continue;
                }
                if(j==0){
                    temp=temp+N;
                    pre=temp;
                    //System.out.print(temp+" ");
                    System.out.print(temp+" ");
                }
                if(j>0){
                    temp=temp-(N-1);
                   // System.out.print(temp+" ");
                    System.out.print(temp+" ");

                }
            }
            temp=pre;
            System.out.println();
        }
    }
}
