class Solution {
    public int partitions(int[] nums, int maxsum){
        int partition = 1;
        long subarraysum=0;
        for(int num : nums){
            if(subarraysum+num<=maxsum){
                subarraysum+=num;
            }
            else{
                partition++;
                subarraysum = num;
            }
        }
return partition;
        }
    
    public int splitArray(int[] nums, int k) {
        int low = 0;
        int high=0;
        for(int i = 0; i < nums.length; i++){
    low = Math.max(low, nums[i]);
}

for(int i = 0; i < nums.length; i++){
    high += nums[i];
}
        int ans=0;
        while(low<=high){
             int mid = low + (high - low) / 2;

            int res=  partitions(nums, mid);
if(res > k){
    low = mid + 1;
}
else{
    high = mid - 1;
}
        }

        return low;
    }
}