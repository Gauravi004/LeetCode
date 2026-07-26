class Solution {
    public int lengthOfLongestSubstring(String s) {
       int i = 0;
        int j = 0;
        int n = s.length();
        int max = 0;

        HashMap<Character, Integer> mp = new HashMap<>();

        while(j < n){

            // add current character
            mp.put(s.charAt(j), mp.getOrDefault(s.charAt(j), 0) + 1);


            // valid window (no duplicate)
            if(mp.size() == j - i + 1){

                max = Math.max(max, j - i + 1);

                j++;
            }


            // duplicate present
            else if(mp.size() < j - i + 1){

                while(mp.size() < j - i + 1){

                    char ch = s.charAt(i);

                    mp.put(ch, mp.get(ch) - 1);

                    if(mp.get(ch) == 0){
                        mp.remove(ch);
                    }

                    i++;
                }

                j++;
            }
        }
return max;
    }
}