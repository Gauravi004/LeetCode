class Solution { public int atMost(int[] nums, int k) {

        int i = 0, j = 0;
        int count = 0;
        int n = nums.length;

        HashMap<Integer, Integer> mp = new HashMap<>();

        while (j < n) {

            mp.put(nums[j], mp.getOrDefault(nums[j], 0) + 1);

            while (mp.size() > k) {
                mp.put(nums[i], mp.get(nums[i]) - 1);

                if (mp.get(nums[i]) == 0) {
                    mp.remove(nums[i]);
                }

                i++;
            }

            // jitni windows j par end ho rahi hain
            count += (j - i + 1);

            j++;
        }

        return count;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
       return atMost(nums, k) - atMost(nums, k - 1);

        
    }
}