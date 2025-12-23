package Divide_and_Conquer.Convert_Sorted_List_to_BST;

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}
    TreeNode(int val) {
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {

    public TreeNode sortedListToBST(ListNode head) {

        // Base case
        if (head == null) return null;

        // Single node becomes leaf
        if (head.next == null) {
            return new TreeNode(head.val);
        }

        // Find middle of linked list
        ListNode mid = getMid(head);

        // Middle node becomes root
        TreeNode root = new TreeNode(mid.val);

        // Recursively build left and right subtrees
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(mid.next);

        return root;
    }

    // Helper function to find middle node
    public ListNode getMid(ListNode head) {
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;

        // slow moves 1 step, fast moves 2 steps
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // Disconnect left half from middle
        if (prev != null) {
            prev.next = null;
        }

        // slow is the middle node
        return slow;
    }
}
