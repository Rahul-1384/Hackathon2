public class LastOccurence {
    public static void lastOccurence(int[] arr,int target,int i){
        if(i==0){
            return;
        }
        if(arr[i]==target){
            System.out.println(i);
            return;
        }
        lastOccurence(arr, target, i-1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,3,4,5,2,3,4};
        int target=2;
        lastOccurence(arr, target, arr.length-1);
    }
}
