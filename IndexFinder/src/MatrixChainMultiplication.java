class MatrixChainMultiplication {
    public static int matrixChainOrder(int[] dimensions) {
        int n = dimensions.length;
        int[][] dp = new int[n][n];

        // Initialize dp table with 0s (default value)

        // Fill dp table diagonally
        for (int length = 2; length < n; length++) {
            for (int i = 1; i < n - length + 1; i++) {
                int j = i + length - 1;
                dp[i][j] = Integer.MAX_VALUE;

                for (int k = i; k < j; k++) {
                    int cost = dp[i][k] + dp[k + 1][j] + dimensions[i - 1] * dimensions[k] * dimensions[j];
                    dp[i][j] = Math.min(dp[i][j], cost);
                }
            }
        }

        return dp[1][n - 1];
    }

    public static void main(String[] args) {
        int[] dimensions = {5, 10, 3, 12, 5, 50, 6};
        int minCost = matrixChainOrder(dimensions);
        System.out.println("Minimum cost of matrix chain multiplication: " + minCost);
    }
}
