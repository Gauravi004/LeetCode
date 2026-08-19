class Solution {
    public long func(int[] nums, int speed){
        long res = 0;
        for(int i=0; i<nums.length; i++){
            res  += nums[i]/speed;
            if(nums[i]%speed!=0){
                res++;
            }
        }
        return res;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low =1;
          int high = 0;
        for(int i = 0; i < piles.length; i++) {
            high = Math.max(high, piles[i]);
        }
        int finalans =-1;
        while(low<=high){
            int mid = low+(high-low)/2;

            long ans = func(piles, mid);

            if(ans>h){
                low = mid+1;
         }
            else{
                finalans = mid;
                high=mid-1;
            }
        }
        return finalans;
    }
}