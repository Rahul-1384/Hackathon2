public class decreasing_order {

    public static void decreasingOrder(int n){
        if(n==0){
            System.out.println(n);
            return;
        }
        decreasingOrder(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n=10;
        decreasingOrder(10);
    }
}
