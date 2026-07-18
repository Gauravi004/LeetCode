class Solution {
    public int characterReplacement(String s, int k) {
        int i =0;
        int j=0;
        int maxlen =0;
        int maxcount =0;
        int n = s.length();

        HashMap<Character, Integer> mp = new HashMap<>();

        while(j<n){
            mp.put(s.charAt(j), mp.getOrDefault(s.charAt(j) ,0)+1);

            maxcount = Math.max(maxcount, mp.get(s.charAt(j)));

            while((j-i+1)  - maxcount > k){
                 mp.put(s.charAt(i), mp.get(s.charAt(i))-1);
                 if(mp.get(s.charAt(i)) == 0){
        mp.remove(s.charAt(i));
    }
                 i++;

            }

            maxlen  =Math.max(maxlen, (j-i+1));  


j++;

        }

return maxlen;
        
    }
}