
public class subsets {
    public static void subsetsOfString(String str,int idx,String ans){
        if(idx==str.length()){
            System.out.println(ans);
            return;
        }
        subsetsOfString(str, idx+1, ans+str.charAt(idx));
        subsetsOfString(str, idx+1, ans);

    }
    public static void main(String[] args) {
        String str="abc";
        int idx=0;
        String ans="";
        subsetsOfString(str, 0, "");
    }
}
