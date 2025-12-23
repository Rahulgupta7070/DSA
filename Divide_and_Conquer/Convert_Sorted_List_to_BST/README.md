# 109. Convert Sorted List to Binary Search Tree

**Topic:** Linked List, Binary Search Tree, Recursion  
**Difficulty:** Medium  
**Language:** Java  

---

## 🧠 Problem Statement
You are given the head of a **sorted singly linked list** where the elements are in
ascending order. Convert it into a **height-balanced Binary Search Tree (BST)**.

A height-balanced BST is defined as a binary tree in which the depth of the two
subtrees of every node never differs by more than one.

---

## 🚀 Approach
- Use **slow and fast pointers** to find the middle of the linked list.
- The middle node becomes the **root** of the BST.
- Left part of the list forms the **left subtree**.
- Right part of the list forms the **right subtree**.
- Recursively repeat this process for both halves.

---

## 💡 Key Insight
In a sorted structure, choosing the **middle element as root** ensures the BST
remains height-balanced.

---

## ⏱ Complexity
- **Time Complexity:** `O(n log n)`
- **Space Complexity:** `O(log n)` (recursion stack)

---


