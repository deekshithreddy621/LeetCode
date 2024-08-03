class Solution {
    public String largestOddNumber(String num) {
        int len = num.length();
        int count = 0;
        for(int i=len-1;i>=0;i--){
            char c = num.charAt(i);
            int n = c - '0';
            if(n%2 !=0 ){
                return num.substring(0,len-count);
            }
            count++;
        }
        return "";
    }
}