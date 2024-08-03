class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hm = new HashMap<>();
        HashSet<Character> hs = new HashSet<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            char d = t.charAt(i);
            if(hm.containsKey(c)){
                if(hm.get(c) != d){
                    return false;
                }
            }
            else{
                if(hs.contains(d)){
                    return false;
                }
                hm.put(c,d);
                hs.add(d);
            }
        }
        return true;
        
    }
}