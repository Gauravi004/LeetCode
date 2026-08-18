class Solution {
    public int findPeakElement(int[] nums) {
        int low =0;
        int high = nums.length-1;
        int res = 0;
        if(nums.length==1){
            return 0;
        }

        while(low<high){
            int mid = (low+high) /2;
            

            if(nums[mid]>nums[mid+1]){
                res = mid;
                high = mid ;
            }

            else{
                
                low = mid+1;
            }
              if (nums[low] > nums[res]) {
            res = low;
        }
        }

        return res;
    }
}