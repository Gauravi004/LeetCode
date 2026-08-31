class Solution {
    public String removeOuterParentheses(String s) {
        String result ="";
        int counter =0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                counter++;
                if(counter>1){
                result = result + s.charAt(i);
                }
            }
            if(s.charAt(i)==')'){
                 counter--;
                if(counter>0){
                   
result  =result+s.charAt(i);
                }
               
            }
        }
        return result;
    }
}