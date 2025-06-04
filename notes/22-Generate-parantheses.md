# Problem Statement
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

# Approach

As we require result in well ordered manner, used backtracking with recursion. As per constraints (opening bracket >= closing bracket at any given index) generated all valid strings. If string equals required length(nx2), add it to result list.
