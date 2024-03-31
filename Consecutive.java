public class Consecutive {
    public static void consecutive(int n,int lastplace,String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        consecutive(n-1, 0, ans+"0");
        if(lastplace==0){
            consecutive(n-1, 1, ans+"1");
        }
    }
    public static void main(String[] args) {
        consecutive(3, 0, "");
    }
    
}
