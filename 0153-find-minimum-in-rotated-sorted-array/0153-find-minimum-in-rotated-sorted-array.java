class Solution {
    public int findMin(int[] ar) {
        int n = ar.length;
        int low = 0, high = n-1;
        int min = Integer.MAX_VALUE;
        
        while(low<=high){
            int mid = (low+high)/2;
            if(ar[mid]<min){
                min = ar[mid];
            }
            if(ar[low]<=ar[mid]){
                if(ar[mid]<=ar[high]){
                    high = mid-1;
                    
                }
                else{
                    low = mid+1;
                    
                }
            }
            else{
                if(ar[mid]>=ar[high]){
                    low = mid+1;
                    
                }
                else{
                    high = mid-1;
                    
                }
            }
        }
        return min;
    }
}