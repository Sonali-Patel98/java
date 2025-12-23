public class DAY_3_IN_ROTATED_TARGET_FIND {
    public static void main(String[] args) {
        int arr[]={3,4,5,1,2};
        System.out.println(FindTarget(arr,12));
    }
    static int FindTarget(int[] arr,int target){
        int s=0;
        int end=arr.length-1;
        while(s<=end){
            int mid=s+(end-s)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>arr[end]){
                if(target>arr[mid] && target <=arr[end]){
                    s=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            else{
                if(target>arr[s] && target <arr[mid]){
                    end = mid - 1;

                }
                else {
                    s=mid+1;
                }
            }
        }
        return -1;
    }
}
