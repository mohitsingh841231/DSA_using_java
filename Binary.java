public class Binary {
    static boolean binarysearch(int arr[],int target){
        int n = arr.length;
        int st=0 ;
        int ed =n-1;
        while(st<=ed){
            int mid = (st+ed)/2;
            if(target ==arr[mid]){
                return true;
            }else if( target <arr[mid]){
                ed = mid-1;
            }
            else{
                st = mid+1;
            }
        }return false;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6,8,9,17,23,56};
        int target = 25;
        System.out.print( binarysearch(arr, target));

    }
}