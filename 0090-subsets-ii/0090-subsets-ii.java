class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        HashSet<List<Integer>> hs = new HashSet<>();
        subset(0,new ArrayList<>(), hs, nums);
        for(List<Integer> ele: hs){
            res.add(new ArrayList<>(ele));
        }
        return res;
    }
    void subset(int idx, List<Integer> list, HashSet<List<Integer>> hs, int[] nums){
        if(idx == nums.length){
            List<Integer> list1= new ArrayList<>(list);
            Collections.sort(list1);
            hs.add(new ArrayList<>(list1));
            return;
        }
        list.add(nums[idx]);
        subset(idx+1, list, hs, nums);
        list.remove(list.size() - 1);
        subset(idx+1, list, hs, nums);
    }
}