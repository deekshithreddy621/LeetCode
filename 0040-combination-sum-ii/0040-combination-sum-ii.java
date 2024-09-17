class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        combiSum(candidates, target, 0, new ArrayList<>(), res);
        return res;
    }
    void combiSum(int[] candidates, int target, int idx, List<Integer> list, List<List<Integer>> res){
        if(target == 0){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i = idx; i<candidates.length;i++){
            if(i>idx && candidates[i] == candidates[i-1])continue;
            if(candidates[i]>target)break;
            list.add(candidates[i]);
            combiSum(candidates, target-candidates[i], i+1, list, res);
            list.remove(list.size()-1);
        }
    }
}