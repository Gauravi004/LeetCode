class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int num:nums){
            mp.put(num, mp.getOrDefault(num,0) + 1 );
        }

        PriorityQueue<Pair<Integer, Integer>> MinHeap =  new PriorityQueue<>((a, b) -> a.getKey() - b.getKey());
        ArrayList<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            MinHeap.add(new Pair<>(entry.getValue(), entry.getKey()));

            if(MinHeap.size() > k){
                MinHeap.poll();

            }
        }

        while(!MinHeap.isEmpty()){
            result.add(MinHeap.poll().getValue());


        }
        int[] ans = new int[k];
for (int i = k - 1; i >= 0; i--) {
    ans[i] = result.get(i);
}
return ans;

        
    }
}