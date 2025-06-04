# Problem Statement

You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.

# Approach

Starting from the initial position, explore all possible positions that can be reached with a jump. Recursively check which positions can be reached from each new position. If the last index is reached, return.

# Complexity

## Time : O(n)
## Space : O(n)
