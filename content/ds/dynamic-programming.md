
# Dynamic Programming


#### Basics

* It is mainly an optimization over plain recursion. Wherever we see a recursive solution that has repeated calls for the same inputs, we can optimize it using Dynamic Programming.
* The idea is to simply store the results of subproblems so that we do not have to re-compute them when needed later. 
* This simple optimization typically reduces time complexities from exponential to polynomial.






##### When to Use Dynamic Programming (DP)?
1. Optimal Substructure: We use the optimal results of subproblems to achieve the optimal result of the bigger problem.
2. Overlapping Subproblems: The same subproblems are solved repeatedly in different parts of the problem 



##### Approaches of Dynamic Programming (DP)

Dynamic programming can be achieved using two approaches:

1. Top-Down Approach (Memoization):
In the top-down approach, also known as memoization, we keep the solution recursive and add a memoization table to avoid repeated calls of same subproblems.

Before making any recursive call, we first check if the memoization table already has solution for it.
After the recursive call is over, we store the solution in the memoization table.



* Top-down approach
* Stores the results of function calls in a table.
* Recursive implementation
* Entries are filled when needed.

'
// Java program to find
// fibonacci number using memoization.
import java.util.Arrays;

class GfG {

    static int fibRec(int n, int[] memo) {

        // Base case
        if (n <= 1) {
            return n;
        }

        // To check if output already exists
        if (memo[n] != -1) {
            return memo[n];
        }

        // Calculate and save output for future use
        memo[n] = fibRec(n - 1, memo) + fibRec(n - 2, memo);

        return memo[n];
    }

    static int fib(int n) {
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);
        return fibRec(n, memo);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(n));
    }
}
'

2. Bottom-Up Approach (Tabulation):
In the bottom-up approach, also known as tabulation, we start with the smallest subproblems and gradually build up to the final solution.

We write an iterative solution (avoid recursion overhead) and build the solution in bottom-up manner.
We use a dp table where we first fill the solution for base cases and then fill the remaining entries of the table using recursive formula.
We only use recursive formula on table entries and do not make recursive calls.

'
// Java program to find
// fibonacci number using tabulation.
import java.util.Arrays;

// Function for calculating the nth Fibonacci number
class GfG {
    static int fibo(int n) {
        int[] dp = new int[n + 1];

        // Storing the independent values in dp
        dp[0] = 0;
        dp[1] = 1;

        // Using the bottom-up approach
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibo(n));
    }
}
'



* Bottom-up approach
* Stores the results of subproblems in a table
* Iterative implementation
* Entries are filled in a bottom-up manner from the smallest size to the final size.




## Nth Fibonacci Number



## Climbing stairs to reach the top


