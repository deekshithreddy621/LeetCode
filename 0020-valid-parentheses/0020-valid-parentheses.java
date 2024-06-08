class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> hm = new HashMap<>();
        hm.put(')','(');
        hm.put('}','{');
        hm.put(']','[');
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(hm.containsKey(c)){
                if(!stack.empty()){
                    if(hm.get(c) != stack.peek()){
                        return false;
                    }
                }
                else
                    return false;
                if(!stack.empty())
                    stack.pop();
            }
            else{
                stack.push(c);
            }
        }
        if(!stack.empty()){
            return false;
        }
        else
            return true;
    }
}