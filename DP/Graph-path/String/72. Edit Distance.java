class Solution {
    public int minDistance(String word1, String word2) {
        int len1 = word1.length() + 1, len2 = word2.length() + 1;
        int[][] dp = new int[len1][len2];
        for (int[] row: dp) {
            Arrays.fill(row, 0);
        }
        
        for (int i = 0; i < len2; i ++) {
            dp[0][i] = i;
        }
        for (int i = 0; i < len1; i ++) {
            dp[i][0] = i;
        }
        for (int i = 1; i < len1; i ++) {
            for (int j = 1; j < len2; j ++) {
                dp[i][j] = Math.min(Math.min(dp[i - 1][j] + 1, dp[i][j - 1] + 1), dp[i - 1][j - 1] + (word1.charAt(i - 1) == word2.charAt(j - 1) ? 0: 1));
            }
        }
        return dp[len1 - 1][len2 - 1];
    }
}
