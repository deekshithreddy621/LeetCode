class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int lenS = s.length();
        int lenT = t.length();
        if(lenS!=lenT){
            return false;
        }
        for(int i=0;i<lenS;i++){
            char c = s.charAt(i);
            if(hm.containsKey(c)){
                hm.put(c,hm.get(c)+1);
            }
            else{
                hm.put(c,1);
            }
        }
        for(int i=0;i<lenT;i++){
            char c = t.charAt(i);
            if(hm.containsKey(c)){
                if(hm.get(c) == 0){
                    return false;
                }
                else{
                    hm.put(c,hm.get(c)-1);
                }
            }
            else{
                return false;
            }
        }
        return true;
    }
}