# Problem Statement
You are given a 0-indexed array of integers nums of length n. You are initially positioned at nums[0].

Each element nums[i] represents the maximum length of a forward jump from index i. In other words, if you are at nums[i], you can jump to any nums[i + j] where:

- 0 <= j <= nums[i] and
- i + j < n

Return the minimum number of jumps to reach nums[n - 1]. The test cases are generated such that you can reach nums[n - 1].

# Approach

we can jump from initial position to 1,2,3...,nums[0]. 
we check from i+1 to i+j and note down min jumps required. maintain a dp array to store min jumps requires from dp[i] to reach end index.
