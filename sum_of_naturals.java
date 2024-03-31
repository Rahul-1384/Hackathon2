public class sum_of_naturals {
    public static void sum(int n,int ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        sum(n-1, ans+n);
    }
    public static void main(String[] args) {
        int n=2;
        sum(n, 0);
    }
    
}
