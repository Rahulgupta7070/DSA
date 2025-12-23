# Merge Sort (Java)

**Topic:** Divide and Conquer  
**Difficulty:** Easy–Medium  
**Language:** Java  

---

## 🧠 Problem Overview
Merge Sort is a comparison-based sorting algorithm that follows the  
**Divide and Conquer** paradigm.  
It divides the array into smaller subarrays, sorts them, and then merges
the sorted subarrays to produce the final sorted array.

---

## 🚀 Approach
1. Divide the array into two halves.
2. Recursively apply Merge Sort on both halves.
3. Merge the two sorted halves into one sorted array.

---

## 🔁 Algorithm Steps
- Find the middle index of the array.
- Sort the left half.
- Sort the right half.
- Merge both halves using a temporary array.

---

## ⏱ Complexity Analysis
- **Time Complexity:** `O(n log n)` (Best, Average, Worst)
- **Space Complexity:** `O(n)`
- **Stability:** Yes (Maintains relative order of equal elements)

---

## 🧪 Example
Input: [6, 3, 9, 5, 2, 8]
Output: [2, 3, 5, 6, 8, 9]