class Solution {
    public String minWindow(String s, String t) {
        int i = 0, j = 0;
        int minlen = Integer.MAX_VALUE;
        int n = s.length();
        int start = 0;

        HashMap<Character, Integer> mp = new HashMap<>();
           for(int r=0; r<t.length(); r++){
            char ch = t.charAt(r);
            mp.put(ch, mp.getOrDefault(ch,0)+1);
        }

          int count = mp.size();


        while (j < n) {

            if(mp.containsKey(s.charAt(j))){
                mp.put(s.charAt(j),mp.get(s.charAt(j))-1);

                if(mp.get(s.charAt(j)) == 0){
                    count--;
                }

            }

        
                while(count == 0){

                     if(j-i+1 < minlen){
                        minlen = j-i+1;
                        start = i;

                    } 
                     if(mp.containsKey(s.charAt(i))){
                     mp.put(s.charAt(i),mp.get(s.charAt(i))+1);

                    if(mp.get(s.charAt(i)) == 1){
                    count++;

                      }
                      }
                
                    i++;
                }

           j++;
        }

return minlen == Integer.MAX_VALUE ? "" : s.substring(start,start+minlen);            
    }
    
}