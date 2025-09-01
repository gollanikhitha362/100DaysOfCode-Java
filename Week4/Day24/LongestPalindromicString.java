class Solution {
    public String longestPalindrome(String s) {
        if(s==null || s.length()==0)
            return "";

        StringBuilder sb = new StringBuilder("^");
        for(char c : s.toCharArray()){
            sb.append("#").append(c);
        }
        sb.append("#$");

        char[] arr = sb.toString().toCharArray();
        int n = arr.length;
        int[] P = new int[n]; 

        int center = 0, right = 0;
        for (int i = 1; i < n - 1; i++) {
            int mirror = 2 * center - i;  
            if (i < right) {
                P[i] = Math.min(right - i, P[mirror]);
            }
            while (arr[i + (1 + P[i])] == arr[i - (1 + P[i])]) {
                P[i]++;
            }
            if (i + P[i] > right) {
                center = i;
                right = i + P[i];
            }
        }
        int maxLen = 0;
        int centerIndex = 0;
        for (int i = 1; i < n - 1; i++) {
            if (P[i] > maxLen) {
                maxLen = P[i];
                centerIndex = i;
            }
        }
        int start = (centerIndex - maxLen) / 2;
        return s.substring(start, start + maxLen);
    }
}
