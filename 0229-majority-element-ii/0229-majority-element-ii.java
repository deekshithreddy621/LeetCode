class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                int count = hm.get(nums[i]);
                hm.put(nums[i], count+1);
            }
            else{
                hm.put(nums[i], 1);
            }
        }
        Iterator hmIterator = hm.entrySet().iterator();
        List<Integer> res = new ArrayList<>();
        while (hmIterator.hasNext()) {
 
            Map.Entry mapElement
                = (Map.Entry)hmIterator.next();
            int cnt = ((int)mapElement.getValue());
            if(cnt > nums.length/3){
                res.add((Integer)mapElement.getKey());
            }
        }
        return res;
    }
}