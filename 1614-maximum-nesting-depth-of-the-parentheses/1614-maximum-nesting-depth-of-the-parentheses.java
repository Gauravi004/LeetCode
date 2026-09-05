class Solution {
    public int maxDepth(String s) {
        int ans = 0;
        int counter = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                counter++;
            }
            else if(s.charAt(i) == ')'){
                counter--;
            }
            ans = Math.max(ans, counter);
        }

        return ans;
    }
}