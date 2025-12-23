public class DAY_3_IN_ROTATED_MIN {
    public static void main(String[] args) {
        int[] arr={5,6,7,8,9,10,1,2,3,4};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int n=arr.length;
        int st=0;
        int end=arr.length-1;
        int ans=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]>arr[n-1]){
                st=mid+1;
            }
            else if(arr[mid]<=arr[n-1]){
                ans=mid;
                end=mid-1;
            }
        }
        return ans;
    }
}
