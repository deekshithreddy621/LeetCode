class Solution {
    long pow(long x, long n){
        if(n==0){
            return 1;
        }
        long p = pow(x,n/2);
        if(n%2 == 0){
            return (p*p)%mod;
        }
        else{
            return (x*p*p)%mod;
        }
    }
    long mod  = (int)1e9+7;
    public int countGoodNumbers(long n) {
        long oddIdx = 4;//2,3,5,7
        long evenIdx = 5;//0,2,4,6,8
        if(n%2 == 0){
            long ans = pow(oddIdx,n/2)* pow(evenIdx,n/2);
            ans = ans%mod;
            return (int)ans;
        }
        else{
            long ans = pow(oddIdx,n/2)*pow(evenIdx,(n/2)+1);
            ans = ans%mod;
            return (int)ans;
        }
    }
}