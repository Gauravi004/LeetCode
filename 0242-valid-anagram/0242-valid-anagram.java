class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        char[] arr2 = t.toCharArray();
        Arrays.sort(arr2);

        if(s.length() != t.length()){
            return false;
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
}