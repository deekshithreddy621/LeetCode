class NumArray {
    int ar[];
    public NumArray(int[] nums) {
        int sum = 0;
        ar = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            sum = sum+nums[i];
            ar[i] = sum;
        }
    }
    
    public int sumRange(int left, int right) {
        if(left != 0){
            return ar[right] - ar[left-1];
        }
        else{
            return ar[right];
        }
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */