import com.leetcode;
class Solution {
    public int climbStairs(int n) {
        if(n <= 2){
            return n;
        }
        int fno = 1;
        int sno = 2;
        for(int i=3; i<=n; i++){
            int res = fno + sno;
            fno = sno;
            sno = res; 
        }
        return sno;
    }
}
