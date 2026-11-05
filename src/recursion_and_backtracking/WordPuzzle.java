package recursion_and_backtracking;

public class WordPuzzle {

    static char[][] grid = {
            {'C', 'A', 'T', 'S'},
            {'O', 'R', 'E', 'A'},
            {'D', 'E', 'A', 'M'},
            {'E', 'L', 'L', 'S'}
    };

    static String word = "DREAM";

    static int rows = 4;
    static int cols = 4;

    static boolean[][] visited = new boolean[4][4];

    static int[] rowDir = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] colDir = {-1, 0, 1, -1, 1, -1, 0, 1};

    static boolean search(int row, int col, int index) {

        if (index == word.length()) {
            return true;
        }

        if (row < 0 || col < 0 || row >= rows || col >= cols) {
            return false;
        }

        // Character and visited check
        if (grid[row][col] != word.charAt(index) || visited[row][col]) {
            return false;
        }

        visited[row][col] = true;

        for (int i = 0; i < 8; i++) {

            int newRow = row + rowDir[i];
            int newCol = col + colDir[i];

            if (search(newRow, newCol, index + 1)) {
                return true;
            }
        }

        visited[row][col] = false;

        return false;
    }

    public static void main(String[] args) {

        boolean found = false;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (grid[i][j] == word.charAt(0)) {

                    if (search(i, j, 0)) {
                        found = true;
                        break;
                    }
                }
            }

            if (found) {
                break;
            }
        }

        if (found) {
            System.out.println("Word DREAM found!");
        } else {
            System.out.println("Word DREAM not found!");
        }
    }
}