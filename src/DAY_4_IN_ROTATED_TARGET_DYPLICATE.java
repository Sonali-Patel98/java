public class DAY_4_IN_ROTATED_TARGET_DYPLICATE {
    public static void main(String[] args) {
        int[] arr={1,1,1,1,1,1,2,3,1,1};
        System.out.println("hi");
        System.out.println(TargetDuplicate(arr,10));
    }
    static int TargetDuplicate(int[] arr,int target){
        int st=0;
        int end=arr.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]==target){
                return  mid;
            }
            else if(arr[st]==arr[mid] && arr[end]==arr[mid]){
                st++;
                end--;
            }
            else if(arr[mid]<=arr[end]){
                if(target>arr[mid] && target<=arr[end]){
                    st=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            else{
                if(target>=arr[st] && target<arr[mid]){
                    end=mid-1;
                }
                else{
                    st=mid+1;
                }
            }
        }
        return -1;
    }
}
