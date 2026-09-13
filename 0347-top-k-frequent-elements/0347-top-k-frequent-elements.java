class Solution {
   public int[] topKFrequent(int[] nums, int k) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i=0; i<nums.length; i++){
        map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
    }

    // min-heap by frequency
    PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[1] - b[1]);

    for(Map.Entry<Integer, Integer> entry : map.entrySet()){
        pq.add(new int[]{entry.getKey(), entry.getValue()});
        if(pq.size() > k){
            pq.poll();
        }
    }

    List<Integer> list = new ArrayList<>();
    while(!pq.isEmpty()){
        list.add(pq.poll()[0]);
    }

    int[] ans = new int[k];
    for(int i=0; i<list.size(); i++){
        ans[i] = list.get(i);
    }
    return ans;
}
}