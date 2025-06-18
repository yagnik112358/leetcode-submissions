# Problem Statement

Given an array arr of n integers and an integer target, determine if there is a subset of the given array with a sum equal to the given target.


Examples:
Input: arr = [1, 2, 7, 3], target = 6

Output: True

Explanation: There is a subset (1, 2, 3) with sum 6.

# Approach

## First approach (recursion)
we recursively consider for every element, either consider it or not.

subsetSum(n,k) = subsetSum(n-1, k-nums[n-1]) || subsetSum(n-1,k)


## Second approach (Memoization)
For efficiency, we memoize the answers of already calculated results.

## Third approach (Iterative DP)

Iterate nxk times, base case is k=0 => true
n=0 => false(except k=0)

dp[i][j] = dp[i-1][j-nums[i]] || dp[i-1][j];