class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                int count = hm.get(nums[i])+1;
                hm.put(nums[i], count);
                if(count>Math.floor(nums.length/2)){
                    return nums[i];
                }
            }
            else{
                hm.put(nums[i], 1);
                
            }
        }
        return 0;
    }
}