class Solution {
    public String frequencySort(String s) {
            String ans ="";
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        List<Map.Entry<Character, Integer>> list =
        new ArrayList<>(map.entrySet());

list.sort((a, b) -> b.getValue() - a.getValue());

for (Map.Entry<Character, Integer> entry : list)
    for(int i=0; i<entry.getValue(); i++){
ans+=entry.getKey();
    }

     return ans;   
    }
}