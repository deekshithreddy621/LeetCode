class Solution {
    public String reverseWords(String s) {
        int len = s.length();
        String res = "", temp="";
        boolean flag = true;
        for(int i=len-1;i>=0;i--){
            char c = s.charAt(i);
            if(c!=' '){
                temp = c+temp;
                flag = false;
            }
            else if(flag == false){
                flag = true;
                res += temp + " ";
                temp = "";
            }
            
        }
        if(flag == false){
            res+=temp+" ";
        }
        return res.substring(0,(res.length()-1));
    }
}