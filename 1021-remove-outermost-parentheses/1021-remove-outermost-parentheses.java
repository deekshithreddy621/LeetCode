class Solution {
    public String removeOuterParentheses(String s) {
        int count = 0;
        String res = "";
        String temp = "";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '('){
                count++;
                temp += c;
            }
            else{
                --count;
                temp += c;
                if(count == 0){
                    int n = temp.length();
                    res = res + temp.substring(1,n-1);
                    temp = "";
                }
            }
        }
        return res;
    }
}