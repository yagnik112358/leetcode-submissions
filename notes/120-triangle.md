# Problem Statement 
Given a triangle array, return the minimum path sum from top to bottom.

For each step, you may move to an adjacent number of the row below. More formally, if you are on index i on the current row, you may move to either index i or index i + 1 on the next row.

# Approach

Maintain 2 arrays for orchestration, iterate through levels in triangle one by one. At every level dp will contain the min possible path to reach at ith level and jth position. dpPrev maintains prev levels minimum paths.
