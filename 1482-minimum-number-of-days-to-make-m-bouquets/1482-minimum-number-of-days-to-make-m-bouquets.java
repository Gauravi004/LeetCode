class Solution {
    public boolean ispossible(int[]bloomdays, int day, int m, int k){
        int count=0;
        int bouquets=0;

        for(int bloom: bloomdays){
            if(bloom<=day){
                count++;
                if(count==k){
                    bouquets++;
                    count=0;
                }
            }
            else{
                count=0;
            }
        }
            return bouquets>=m;
        }
  
    public int minDays(int[] bloomDay, int m, int k) {
        int low = 0;
         int high = 0;
         int ans=-1;
        for(int i = 0; i < bloomDay.length; i++) {
            high = Math.max(high, bloomDay[i]);
        }

        while(low<=high){
            int mid = low +(high-low)/2;
            boolean pos = ispossible(bloomDay, mid, m , k);
            if(pos){
                ans = mid;
                high =mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
}