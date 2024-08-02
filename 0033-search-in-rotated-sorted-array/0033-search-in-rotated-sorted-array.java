class Solution {
    public int search(int[] ar, int target) {
        int n = ar.length;
        int low  = 0, high=n-1;
       while(low<=high){
           int mid = (low+high)/2;
           if(ar[mid] == target){
               return mid;
           }
           if(ar[low]<=ar[mid]){
               if(ar[low]<=target && target<=ar[mid]){
                   high = mid-1;
               }
               else{
                   low = mid+1;
               }
           }
           else{
               if(ar[mid]<=target && target<=ar[high]){
                   
                   low = mid+1;
               }
               else{
                   high = mid-1;
               }
           }
       } 
        return -1;
    }
}