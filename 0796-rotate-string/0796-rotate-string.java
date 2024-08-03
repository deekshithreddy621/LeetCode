class Solution {
    public boolean rotateString(String s, String goal) {
        int lenOfS = s.length();
        int lenOfGoal = goal.length();
        if(lenOfS!=lenOfGoal){
            return false;
        }
        if(s.equals(goal)){
            return true;
        }
        if(lenOfS == 1){
            return false;
        }
        for(int i=0;i<lenOfGoal;i++){
            s=s.substring(1)+s.charAt(0);
            if(s.equals(goal)){
                return true;
            }
        }
        return false;
    }
}