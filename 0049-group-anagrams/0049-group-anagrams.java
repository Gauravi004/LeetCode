class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, ArrayList<String>> map = new HashMap<>();

for (String s : strs) {

    char[] chars = s.toCharArray();
    Arrays.sort(chars);

    String key = new String(chars);

    if (!map.containsKey(key)) {
        map.put(key, new ArrayList<>());
    }

    map.get(key).add(s);
}

for(Map.Entry<String, ArrayList<String>> entry: map.entrySet()){
ans.add(entry.getValue());
}

return ans;
    }
}