// Quad Tree Node definition
class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    public Node() {}

    public Node(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
    }

    public Node(boolean val, boolean isLeaf,
                Node topLeft, Node topRight,
                Node bottomLeft, Node bottomRight) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }
}

// Solution class
class Solution {

    public Node construct(int[][] grid) {
        int n = grid.length;
        return build(grid, 0, 0, n);
    }

    // Recursive function to build quad tree
    private Node build(int[][] grid, int x, int y, int n) {

        // If all values are same, create leaf node
        if (isEqual(grid, x, y, n)) {
            return new Node(grid[x][y] == 1, true);
        }

        int half = n / 2;

        // Non-leaf node
        Node root = new Node(true, false);

        root.topLeft = build(grid, x, y, half);
        root.topRight = build(grid, x, y + half, half);
        root.bottomLeft = build(grid, x + half, y, half);
        root.bottomRight = build(grid, x + half, y + half, half);

        return root;
    }

    // Check if sub-grid has all same values
    private boolean isEqual(int[][] grid, int x, int y, int n) {
        int val = grid[x][y];

        for (int i = x; i < x + n; i++) {
            for (int j = y; j < y + n; j++) {
                if (grid[i][j] != val) {
                    return false;
                }
            }
        }
        return true;
    }
}

// Optional Main class (for VS Code testing)
class Main {
    public static void main(String[] args) {

        int[][] grid = {
            {1, 1, 0, 0},
            {1, 1, 0, 0},
            {0, 0, 1, 1},
            {0, 0, 1, 1}
        };

        Solution sol = new Solution();
        Node root = sol.construct(grid);

        System.out.println("Quad Tree constructed successfully!");
    }
}
