class Solution {
    
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        generate(0,0,"",n,list);
        return list;
    }
    void generate(int o, int c, String s, int n, List<String> list){
        if(o == c && o+c == 2*n){
            list.add(s);
            return;
        }
        if(o<n){
            generate(o+1,c,s+"(",n,list);
        }
        if(c<o){
            generate(o,c+1,s+")",n,list);
        }
    }
}