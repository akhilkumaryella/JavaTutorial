package coding;

/**
 * https://leetcode.com/problems/unique-paths/
 * sol : https://www.youtube.com/watch?v=t_f0nwwdg5o&list=PLgUwDviBIf0rPG3Ictpu74YWBQ1CaBkm2&index=18&ab_channel=takeUforward
 */
public class UniquePaths {

    public static void main(String[] args) {

    }

    // recursion
    public int countPaths(int i, int j, int m, int n) {

        if(i == m - 1 && j == n - 1) return 1;

        if(i >= m || j >= n) return 0;
        else return countPaths(i, j + 1, m, n) + countPaths(i + 1, j, m, n);
    }

    // dynamic programming
    // usually dynamic programming is optimal solution of recursion
    // here if there is any repetitive work, we are diminishing by storing that solution
    // hence next time if we are going to that path we already know the answer and simply returning that one
    public int countPaths(int i, int j, int m, int n, int[][] dp) {

        if(i == m - 1 && j == n - 1) return 1;

        if(i >= m || j >= n) return 0;
        if(dp[i][j] != 0) return dp[i][j];
        else {
            return dp[i][j] = countPaths(i, j + 1, m, n, dp) + countPaths(i + 1, j, m, n, dp);
        }
    }

    // optimal approach
    // from starting point to ending point we have travel in matrix
    // for this maximum right directions will be (no.of columns - 1)
    // bottom directions -> (no.of rows - 1)
    // total : no.of rows + no.of columns - 1
    // if we choose no.of right directions or no.of bottom directions from this total, that is the output
    public int countPaths(int m, int n) {

        int total = m + n - 2;
        int r = m - 1;
        double res = 1;
        for(int i = 1; i <= r; i++) {
            res = res * (total - r + i) / i;
        }

        return (int) res;
    }


}
