class Solution {
    public boolean isPalindrome(int x) {
        int m=x;
        long s=0;
        while(x>0){
            int rem=x%10;
            s=s*10+rem;
            x/=10;
        }
        if(s==m){
            return true;
        }
        else{
            return false;
        }

        
    }
}