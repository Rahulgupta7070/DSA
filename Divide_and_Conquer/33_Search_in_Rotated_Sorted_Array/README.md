# 33. Search in Rotated Sorted Array

**Topic:** Binary Search  
**Difficulty:** Medium  
**Language:** Java  

---

## Problem Statement
You are given a rotated sorted array of distinct integers `nums` and an integer `target`.
Return the index of `target` if it exists, otherwise return `-1`.

---

## Approach
- Use **Modified Binary Search**
- At every step, one half of the array is always sorted
- Check which half is sorted
- Decide whether the target lies in the sorted half
- Reduce the search space accordingly

---

## Complexity
- **Time Complexity:** O(log n)
- **Space Complexity:** O(1)

---

##  Example
Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
