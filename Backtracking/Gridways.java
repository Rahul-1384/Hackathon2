public class Gridways {
    public static void ways(int[][] arr,int row,int col,String ans){
        if(row==2 && col==2){
            System.out.println(ans);
            return;
        }
        if(row<0 || col<0 || row==arr.length || col==arr[0].length || arr[row][col]==1){
            return;
        }
        ways(arr, row+1, col, ans+"V");
        ways(arr, row, col+1, ans+"H");
    }
    public static void main(String[] args) {
        int arr[][]=new int[3][3];
        ways(arr, 0, 0, "");
    }
}
