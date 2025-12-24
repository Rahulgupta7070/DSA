# 427. Construct Quad Tree

**Topic:** Divide and Conquer  
**Difficulty:** Medium  
**Language:** Java  

---

## 🧠 Problem Statement
You are given an `n x n` binary matrix `grid` where `n` is a power of 2.
Construct a **Quad Tree** representation of the grid.

A Quad Tree node can be:
- **Leaf Node** → if all values in the current grid are the same
- **Non-Leaf Node** → if values are different, divide the grid into 4 equal parts

---

## 🌳 Quad Tree Rules
- If the current sub-grid has **all 0s or all 1s**, create a **leaf node**
- Otherwise, divide the grid into:
  - `topLeft`
  - `topRight`
  - `bottomLeft`
  - `bottomRight`
- Recursively apply the same process

---

## 🚀 Approach (Divide and Conquer)
1. Check if all values in the current grid are equal  
2. If yes → create a **leaf node**
3. If no → divide the grid into 4 parts
4. Recursively build quad tree for each part

---


## ⏱ Complexity Analysis
- **Time Complexity:** O(n²)
- **Space Complexity:** O(n²) (recursion + tree nodes)