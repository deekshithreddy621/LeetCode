class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int sum = 0;
        // int ar[] = new int[nums.length];
        int res[] = new int[queries.length];
        for(int i=0;i<nums.length;i++){
            if((nums[i]%2) == 0){
                sum+=nums[i];
                // ar[i]=1;
            }
        }
        for(int i=0;i<queries.length;i++){
            int val = queries[i][0];
            int index = queries[i][1];
            int currentNum = nums[index];
            if(currentNum%2 == 0)
                sum -= currentNum;
            nums[index] += val;
            currentNum = nums[index];
            if(currentNum%2 == 0)
                sum += currentNum;
            res[i] = sum;
//             if(nums[index]%2==0 && (val%2 == 0)){
//                 sum +=val;
//                 nums[index] += val;
//                 res[i] = sum;
//             }
//             else if(nums[index]%2 == 0 && (val%2==1)){
//                 sum = sum-nums[index];
//                 nums[index] += val;
//                 res[i] = sum;
//             }
//             else if(nums[index]%2 == 1 && (val%2 == 1)){
//                 sum = sum + nums[index] + val;
//                 nums[index] += val;
//                 res[i] = sum;
                
//             }
//             else if(nums[index]%2 == 1 && (val%2 == 0)){
//                 nums[index]+=val;
//                 res[i] = sum;
//             }
        
            
        }
        return res;
    }
}