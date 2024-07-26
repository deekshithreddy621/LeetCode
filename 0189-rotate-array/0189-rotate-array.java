class Solution {
    public void rev(int nums[], int s, int e){
        while(s<=e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;e--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(n==1)
            return;
        k = k%n;
        rev(nums,0,n-k-1);//We reverse first n-k elements
        rev(nums,n-k,n-1);//We reverse last k elements
        rev(nums,0,n-1);//We reverse the entire array
    }
}