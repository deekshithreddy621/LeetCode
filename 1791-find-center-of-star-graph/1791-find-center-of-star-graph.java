class Solution {
    public int findCenter(int[][] edges) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(edges[0][0],1);
        hm.put(edges[0][1],1);
        if(hm.containsKey(edges[1][0])){
            return edges[1][0];
        }
        return edges[1][1];
    }
}