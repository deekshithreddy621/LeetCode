class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if(len == 0){
            return 0;
        }
        int ans = 0;
        int count = 0;
        int first = 0, second = 0;
        HashSet<Character> hs = new HashSet<>();
        while(first<=second && first<len && second<len){
            if(!hs.contains(s.charAt(second))){
                hs.add(s.charAt(second));
                ++count;
                if(count>ans){
                    ans = count;
                }
                ++second;
            }
            else{
                while(first<second){
                    if(s.charAt(first) == s.charAt(second)){
                        hs.remove(s.charAt(first));
                        ++first;
                        --count;
                        break;
                    }
                    hs.remove(s.charAt(first));
                    ++first;
                    --count;
                }
            }
        }
        return ans;
    }
}