class Solution {
    public int longestOnes(int[] nums, int k) {
        // int originalK = k;
        int len = nums.length;
        int first = 0, second = 0;
        int ans = 0;
        while(first<=second && first<len && second<len){
            if(nums[second] == 0){
                k--;
            }
            while(k<0){
                if(nums[first] == 0){
                    k++;
                }
                first++;
            }
            ans = Math.max(ans,second-first+1);
            ++second;
        }
        return ans;
    }
}