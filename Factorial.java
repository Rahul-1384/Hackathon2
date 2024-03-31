public class Factorial {
    public static int factorialNumber(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fnm1=n*factorialNumber(n-1);
        return fnm1;
    }
    public static void main(String[] args) {
        int n=3;
        System.out.println(factorialNumber(n));
    }
}
