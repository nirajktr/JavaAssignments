public class Minesweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);
        int minesPlaced = 0;

        boolean[][] mineArray = new boolean[m + 2][n + 2];
        int[][] count = new int[m + 2][n + 2];

        // Place the mines randomly
        while (minesPlaced < k) {
            int row = (int) (Math.random() * m) + 1;
            int column = (int) (Math.random() * n) + 1;

            if (!mineArray[row][column]) {
                mineArray[row][column] = true;
                minesPlaced++;
            }
        }

        // Calculate neighboring mine counts
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (!mineArray[i][j]) {
                    for (int x = -1; x <= 1; x++) {
                        for (int y = -1; y <= 1; y++) {
                            if (mineArray[i + x][j + y]) {
                                count[i][j]++;
                            }
                        }
                    }
                }
            }
        }

        // Print the grid with proper spacing
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (mineArray[i][j]) {
                    System.out.print("*  ");
                } else {
                    System.out.print(count[i][j] + "  ");
                }
            }
            System.out.println();
        }
    }
}
