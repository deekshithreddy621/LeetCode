class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        combiSum(0,target,candidates, res,new ArrayList<Integer>());
        return res;
    }
    void combiSum(int idx, int target,int[] candidates, List<List<Integer>> res, List<Integer> temp){
        if(idx == candidates.length){
            if(target == 0){
                res.add(new ArrayList<>(temp));
            }
            return;
        }
        if(candidates[idx]<=target){
            temp.add(candidates[idx]);
            combiSum(idx, target - candidates[idx], candidates, res, temp);
            temp.remove(temp.size() - 1);
        }
        combiSum(idx+1, target, candidates, res, temp);
    }
}