class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int ar[] = new int[2];
        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<len;j++){
                if(nums[i]+nums[j] == target)
                {
                    ar[0] = i;
                    ar[1] = j;
                    return ar;
                }
                
            }
        }
        return ar;
    }
}