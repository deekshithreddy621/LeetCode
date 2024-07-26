class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(hs.contains(nums[i])){
                hs.remove(nums[i]);
            }
            else{
                hs.add(nums[i]);
            }
        }
        for(Integer ele: hs){
            return ele;
        }
        return -1;
    }
}