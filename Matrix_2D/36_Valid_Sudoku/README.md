# LeetCode 36 – Valid Sudoku ✅

## 🧩 Problem Statement
Given a 9×9 Sudoku board, determine if it is valid.  
The board is valid if:
- Each row contains digits 1–9 without repetition
- Each column contains digits 1–9 without repetition
- Each 3×3 sub-box contains digits 1–9 without repetition  

Empty cells are represented by `.` and should be ignored.

---

## 🚀 Approach
We use **HashSet** to track seen numbers in:
- Rows
- Columns
- 3×3 sub-boxes

For each cell:
- Skip if it is `.`
- Check if the number already exists in the corresponding row, column, or box
- If yes → return `false`
- Otherwise, add it to the respective sets

---
Approach: HashSet
- Time: O(1)
- Space: O(1)