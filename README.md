
# LeetCode Challenge D49

## Overview

Welcome to my LeetCode solution repository! This project addresses the coding challenge presented by [1945. Sum of Digits of String After Convert](https://leetcode.com/problems/sum-of-digits-of-string-after-convert/). Below, you'll find details about the problem, my approach to solving it, and the implemented solution.

## Problem Statement
You are given a string  `s`  consisting of lowercase English letters, and an integer  `k`.

First,  **convert**  `s`  into an integer by replacing each letter with its position in the alphabet (i.e., replace  `'a'`  with  `1`,  `'b'`  with  `2`, ...,  `'z'`  with  `26`). Then,  **transform**  the integer by replacing it with the  **sum of its digits**. Repeat the  **transform**  operation  `k` **times**  in total.

For example, if  `s = "zbax"`  and  `k = 2`, then the resulting integer would be  `8`  by the following operations:

-   **Convert**:  `"zbax" ➝ "(26)(2)(1)(24)" ➝ "262124" ➝ 262124`
-   **Transform #1**:  `262124 ➝ 2 + 6 + 2 + 1 + 2 + 4 ➝ 17`
-   **Transform #2**:  `17 ➝ 1 + 7 ➝ 8`

Return  _the resulting integer after performing the operations described above_.

**Example**
>**Input:** s = "iiii", k = 1
>
>**Output:** 36
>
>**Explanation:** The operations are as follows:
>- Convert: "iiii" ➝ "(9)(9)(9)(9)" ➝ "9999" ➝ 9999
>- Transform #1: 9999 ➝ 9 + 9 + 9 + 9 ➝ 36
>Thus the resulting integer is 36.

**Language Used**
> Java

**Difficulty**
> Easy

## Solution Overview
The solution addresses the task of transforming a string into a numeric representation and repeatedly summing its digits. Initially, the code iterates through each character of the input string, converting them into numeric values based on their positions in the alphabet. These values are concatenated to form a numeric string representing the input. 

Subsequently, a loop is initiated to repeat a specified number of times, wherein each iteration calculates the sum of digits within the current numeric representation. After each summation, the updated sum replaces the existing numeric representation. Once the loop completes, the final numeric string is converted back to an integer using `Integer.parseInt()`, which is then returned as the output. The operation `- '0'` is instrumental in converting characters representing digits to their corresponding numeric values, aiding in the iterative digit summation process...
