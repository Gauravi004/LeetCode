class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
                 
        for(int i=0; i<numRows; i++){
            int ans = 1;
            List<Integer> row = new ArrayList<>();
            
            row.add(1);
            for(int col=1; col<=i; col++){
                ans = ans * (i-col+1);
                ans = ans / (col);
                row.add(ans);
                

            }
            result.add(row);
            
        }
return result;

    }
} 