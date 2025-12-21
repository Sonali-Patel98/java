public class DAY_1_Binary_Search {
    public static void main(String[] args) {
        int[] arr={2,4,5,7,15,20,24,45,50,70};
        System.out.print(BinarySear(arr,0,0,arr.length));
    }
    public static int BinarySear(int[] arr, int target,int st,int end){
        while(st<=end){
            int mid=(st+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(target>arr[mid]){
                st=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
        }
        return -1;
    }
}
