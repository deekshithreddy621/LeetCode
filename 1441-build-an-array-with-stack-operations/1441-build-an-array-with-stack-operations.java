class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int ar[] = new int[n];
        for(int i=0;i<n;i++){
            ar[i] = i+1;
        }
        int idx = 0;
        for(int i=0;i<target.length;i++){
            int x = target[i];
            stack.push(ar[idx++]);
            list.add("Push");
            while(!stack.empty() && stack.peek() != x){
                stack.pop();
                list.add("Pop");
                stack.push(ar[idx++]);
                list.add("Push");
            }
        }
        return list;
    }
} 