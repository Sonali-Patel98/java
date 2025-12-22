public class DAY_2_First_Occurance {
    public static void main(String[] args) {
        int[] arr={6,6,7,6,6,8,9};
        System.out.print(firstOccurance(arr,6));
    }
    static int firstOccurance(int[] arr,int target){
        int st=0;
        int end=arr.length-1;
        int value=-1;
        while (st<=end){
            int mid=st+ (end-st)/2;
            if(arr[mid]==target){
                value=mid;
                end=mid-1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else {
                st=mid+1;
            }
        }
        return value;
    }
}
