public class permutations {
    public static void allPermutations(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            boolean b=false;
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    b=true;
                    break;
                }
            }
            if(b==false){
                allPermutations(str.substring(0, i)+str.substring(i+1), ans+str.charAt(i));
            }
        }

    }
    public static void main(String[] args) {
        String str="aab";
        int idx=0;
        String ans="";
        allPermutations(str,"");
    }
}
