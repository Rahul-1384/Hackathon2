public class Consecutiveones {
    public static void consecutiveOnes(int n,int lastplace,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        consecutiveOnes(n-1, 0, str+"0");
        if(lastplace==0){
            consecutiveOnes(n-1, 1, str+"1");

        }
    }
    public static void main(String[] args) {
        int n=3;
        String str=new String("");
        int lastplace=0;
        consecutiveOnes(n, 0, "");
    }
}
