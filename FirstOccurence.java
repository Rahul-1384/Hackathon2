public class FirstOccurence {
    public static void firstOccurence(int[] arr,int target,int i){
        if(i==arr.length-1){
            if(arr[i]==target){
                System.out.println(i);
            }
            return;
        }
        if(arr[i]==target){
            System.out.println(i);
            
        }
        firstOccurence(arr, target,i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,2};
        int target=2;
        firstOccurence(arr, target,0);
    }
}
