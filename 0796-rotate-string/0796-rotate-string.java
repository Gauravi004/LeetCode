class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        String news  = s+s;
      
            if(news.contains(goal)){
                return true;
            }
        return false;
    }
}