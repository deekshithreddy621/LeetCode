class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        bt(0,temp,nums,res);
        return res;
    }
    void bt(int idx, List<Integer> temp, int nums[], List<List<Integer>> res){
        if(idx == nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[idx]);
        bt(idx+1, temp, nums, res);
        temp.remove(temp.size() - 1);
        bt(idx+1, temp, nums, res);
    }
}