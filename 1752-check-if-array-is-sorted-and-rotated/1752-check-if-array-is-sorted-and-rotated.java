class Solution {
    public boolean check(int[] nums) {
        
        if(nums.length < 2){
            return true;
        }
        boolean flag = true;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1] || flag == false){
                if(flag == false && nums[i]<nums[i-1]){
                    return false;
                }
                flag = false;
                if(nums[0]<nums[i] ){
                    return false;
                }
                
            }
        }
        return true;
    }
}