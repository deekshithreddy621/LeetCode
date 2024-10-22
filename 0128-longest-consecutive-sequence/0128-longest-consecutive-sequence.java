class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        
        Arrays.sort(nums);
        int longestSequence = 1, maxLongestSequence = 1;
        int lastSmall = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]-1 == lastSmall){
                ++longestSequence;
                if(longestSequence>maxLongestSequence){
                    maxLongestSequence = longestSequence;
                }
                lastSmall = nums[i];
            }
            else if(nums[i] == lastSmall){
                continue;
            }
            else{
                longestSequence = 1;
                lastSmall = nums[i];
            }
        }
        return maxLongestSequence;
    }
}