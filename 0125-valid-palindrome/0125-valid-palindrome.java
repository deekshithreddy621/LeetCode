class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String newStr = "";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c>=97 && c<=122){
                newStr+=c;
            }
            else if(c>=48 && c<=57){
                newStr+=c;
            }
            
        }
        return checkPalindrome(newStr, 0, newStr.length()-1);
    }
    public boolean checkPalindrome(String newStr, int start, int end){
        if(start>end || start == end){
            return true;
        }
        if(newStr.charAt(start) != newStr.charAt(end)){
            return false;
        }
        else{
            return checkPalindrome(newStr, start+1, end-1);
        }
        
    }
}