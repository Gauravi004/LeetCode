// Class containing power calculation logic
class Solution {
    
    // Helper method to calculate power using recursion
    private double power(double x, long n) {
        // Base case: anything raised to 0 is 1
        if (n == 0) return 1.0;
        
        // Base case: anything raised to 1 is itself
        if (n == 1) return x;
        
        // If 'n' is even
        if (n % 2 == 0) {
            // Recursive call: square the base and halve the exponent
            return power(x * x, n / 2);
        }
        
        // If 'n' is odd
        // Recursive call: multiply base once and reduce exponent by 1
        return x * power(x, n - 1);
    }
    
    // Public method to handle negative exponents as well
    public double myPow(double x, int n) {
        long N= n;
        // If 'n' is negative, take reciprocal of positive exponent result
        if (N < 0) {
            return 1.0 / power(x, -N);
        }
        // If 'n' is non-negative
        return power(x, N);
    }
}

// Separate main class for testing
class Main {
    public static void main(String[] args) {
        // Create an instance of Solution
        Solution sol = new Solution();
        
        // Example input
        double x = 2.0;
        int n = 10;

        // Calculate power
        double result = sol.myPow(x, n);

        // Print result
        System.out.println(x + "^" + n + " = " + result);
    }
}
