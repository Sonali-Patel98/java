public class DAY_2_Last_Occurance {
    public static void main(String[] args) {
        int arr[]={6,7,7,9,9};
        System.out.println(lastOccurance(arr,6));
    }
    static int lastOccurance(int arr[],int target){
        int si=0;
        int end=arr.length-1;
        int val=-1;
        while ((si<=end)){
            int mid=si+(end-si)/2;
            if(arr[mid]==target){
                val=mid;
                si=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                si=mid+1;
            }
        }
        return val;
    }
}
