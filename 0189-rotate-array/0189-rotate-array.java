class Solution {
    void reverseArray(int[] nums, int start, int end) {
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
       int n = nums.length-1;
    
       if(k<0){
             k+=n;
        }

       k  = k%nums.length;

      
        reverseArray(nums,0, n);

        reverseArray(nums, 0 , k-1);

        reverseArray(nums, k , n);
       
   
    }
}