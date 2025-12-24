public class DAY_4_TARGET_IN_2D {
    public static void main(String[] args) {
        int[][] arr={
                {1,3,5},
                {7,9,11},
                {13,15,17}
        };
        System.out.println(Target2D(arr,13));
//        System.out.println(index[0]+ index[1]);
    }
    static boolean Target2D (int[][] arr,int target){
        int n=arr.length,m=arr[0].length;
        int st=0,end=m*n-1;
        //case for null and row length and column length 0
        if(arr==null || arr.length==0 || arr[0].length==0){
            return false;
        }
        while (st<=end){
            int mid=st+(end-st)/2;
            int EleTarget=arr[mid/m][mid%m];
            int row=mid/m;
            int col=mid%m;
            if(EleTarget==target){
                return true;
            }
            else if(EleTarget>target){
                end=mid-1;
            }
            else {
                st=mid+1;
            }
        }
        return false;
    }
}
