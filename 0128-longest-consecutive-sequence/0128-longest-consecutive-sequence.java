class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        if(nums.length == 0) return 0;
        else if (nums.length == 1) return 1;
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        int longestLen = 1;
        for(Integer ele: hs){
            if(!hs.contains(ele-1)){
                int currentLen = 1;
                int x = ele;
                while(hs.contains(x+1)){
                    x = x+1;
                    longestLen = Math.max(longestLen, ++currentLen);
                }
            }
        }
        return longestLen;
    }
}