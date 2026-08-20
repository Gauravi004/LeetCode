class Solution {
    int daysNeeded(int[] weights, int capacity) {
        // Initialize day count to 1
        int days = 1;
        // Current load for the day
        int currentLoad = 0;

        // Iterate over all package weights
        for (int w : weights) {
            // If adding weight exceeds capacity
            if (currentLoad + w > capacity) {
                // Increase day count and reset load
                days++;
                currentLoad = w;
            } else {
                // Otherwise, add weight to current load
                currentLoad += w;
            }
        }
        // Return total days needed
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        
for(int i = 0; i < weights.length; i++){
    low = Math.max(low, weights[i]);
}

for(int i = 0; i < weights.length; i++){
    high += weights[i];
}
int ans=0;

        while(low<=high){
            int mid = (low+high) /2;
            int daysreq = daysNeeded(weights, mid);
            if(daysreq<=days){
                ans =mid;
                high=mid-1;
            }

            else{
                low = mid+1;
            }

        }
        return ans;

    }
}