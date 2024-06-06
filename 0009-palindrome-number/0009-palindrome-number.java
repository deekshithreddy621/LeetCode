class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        return false;
        else{
            int y = x;
            int revNum = 0;
            while(x!=0){
                int rem = x%10;
                revNum = revNum * 10 + rem;
                x = x/10;
            }
            if(revNum == y)
            return true;
            else
            return false;
        }
    }
}