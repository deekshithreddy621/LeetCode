class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        int len = strs.length;
        String str = "";
        String str1 = strs[0]; // Initialize with the first string
        int lowLength = str1.length();
        
        // Find the string with the lowest length
        for (int i = 1; i < len; i++) {
            if (strs[i].length() < lowLength) {
                lowLength = strs[i].length();
                str1 = strs[i];
            }
        }
        
        // Check common prefix character by character
        for (int i = 0; i < lowLength; i++) {
            char c = str1.charAt(i);
            for (int j = 0; j < len; j++) {
                if (strs[j].charAt(i) != c) {
                    return str;
                }
            }
            str += c;
        }
        return str;
    }
}
