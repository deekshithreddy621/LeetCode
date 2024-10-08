class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];
        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]<0) oddList.add(nums[i]);
            else evenList.add(nums[i]);
        }
        for(int i=0;i<n;i++){
            if(i%2 == 0){
                res[i] = evenList.get(i/2);
            }
            else{
                res[i] = oddList.get(i/2);
            }
        }
        return res;
    }
}