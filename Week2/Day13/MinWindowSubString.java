import com.leetcode;
class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length()) 
            return "";

        int[] need = new int[128];
        int[] window = new int[128];
        for(char c: t.toCharArray()){
            need[c]++;
        }

        int required = t.length();
        int left = 0, right = 0, start = 0;
        int minLen = Integer.MAX_VALUE;

        while(right < s.length()){
            char c = s.charAt(right);

            if(need[c] > 0){
                window[c]++;
                if(window[c] <= need[c]){
                    required--;
                }
            }
            while(required == 0){
                if(right - left + 1 < minLen){
                    minLen = right - left + 1;
                    start = left;
                }
                char leftChar = s.charAt(left);
                if(need[leftChar] > 0){
                    window[leftChar]--;
                    if(window[leftChar] < need[leftChar]){
                        required++;
                    }
                }
                left++;
            }
            right++;
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start,start + minLen);
    }
}
