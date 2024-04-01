public class Knight {
    public static void knightMoves(int[][] arr,int row,int col,String ans){
        if(row>=arr.length || col>=arr[0].length){
            return;
        }
        ans+="{"+row+"-"+col+"}";
        if(row==arr.length-1 && col==arr[0].length-1){
            System.out.println(ans);
            return;
        }
        int r[]={2,1};
        int c[]={1,2};
        // For Knight
        for(int i=0;i<c.length;i++){
            knightMoves(arr, row+r[i], col+c[i], ans+"K");
        }
        // for Rook
        if(row==0 || col==0 || row==arr.length-1 || col==arr[0].length-1){
            // row
            for(int i=1;i<arr.length;i++){
                knightMoves(arr, row+i, col, ans+"R");
            }
            // col
            for(int i=1;i<arr[0].length;i++){
                knightMoves(arr, row, col+i, ans+"R");
            }
        }
        // for Bishop
        if(row==col || row+col==arr.length-1){
            for(int i=1;i<arr.length;i++){
                knightMoves(arr, row+i, col+i, ans+"B");
            }
        }
    }
    public static void main(String[] args) {
        int arr[][]=new int[3][3];
        String ans="";
        knightMoves(arr, 0, 0, "");
    }
}
