class Solution {
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        int index = 0;
        int low = 0, high = len-1, ans = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(target>=nums[mid]){
                ans = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans+1;
    }
}