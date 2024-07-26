class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 1){
            return 1;
        }
        int k=1;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                k++;
                list.add(nums[i]);
            }
        }
        for(int i=0;i<list.size();i++){
            nums[i] = list.get(i);
        }
        return k;
    }
}