// Quad Tree Node definition
class Node {
    boolean val;
    boolean isLeaf;
    Node topLeft, topRight, bottomLeft, bottomRight;

    Node(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
    }
}


class Solution {

    public Node construct(int[][] grid) {
        return build(grid, 0, 0, grid.length);
    }

    private Node build(int[][] grid, int x, int y, int n) {

        // Base case: all values same
        if (isEqual(grid, x, y, n)) {
            return new Node(grid[x][y] == 1, true);
        }

        int half = n / 2;
        Node root = new Node(true, false);

        root.topLeft = build(grid, x, y, half);
        root.topRight = build(grid, x, y + half, half);
        root.bottomLeft = build(grid, x + half, y, half);
        root.bottomRight = build(grid, x + half, y + half, half);

        return root;
    }

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

// MAIN class (VS Code run entry point)
public class Main {
    public static void main(String[] args) {

        int[][] grid = {
            {1, 1, 0, 0},
            {1, 1, 0, 0},
            {0, 0, 1, 1},
            {0, 0, 1, 1}
        };

        Solution sol = new Solution();
        sol.construct(grid);

        System.out.println("Quad Tree constructed successfully");
    }
}
