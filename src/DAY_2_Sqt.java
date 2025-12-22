public class DAY_2_Sqt {
    public static void main(String[] args) {
        int x=48;
        System.out.println(sqt(x));
    }
    static int sqt(int x){
        int s=0;
        int end=x;
        int ans=-1;
        while(s<=end){
            int mid=s+(end-s)/2;
            int val=mid*mid;
            if(val>x){
                end=mid-1;
            }
            else {
                s=mid+1;
                ans=mid;
            }
        }
        return ans;
    }
}
