# Problem Statement
There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any point in time.

Given the two integers m and n, return the number of possible unique paths that the robot can take to reach the bottom-right corner.

The test cases are generated so that the answer will be less than or equal to 2 * 10<sup>9</sup>.


# Approach

For first row and column, number of possible path will always be one. For other positions, we iteratively calculate possible paths till (i,j) by adding possible paths from top and left side. 

DP[i][j] = DP[i-1][j] + DP[i][j-1];
