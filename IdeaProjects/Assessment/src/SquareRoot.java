public class SquareRoot{
    private static double square(int num){
        double root=0,quo=1,temp=0;
        while(true){
            root=0.5*(quo+(num/quo));
            temp=Math.abs(quo-root);
            if(temp<0.00001){
                break;
            }
            quo=root;
        }
        return root;
    }
    public static void main(String[] args) {
        int n=1000;
        System.out.println(square(n));
    }
}