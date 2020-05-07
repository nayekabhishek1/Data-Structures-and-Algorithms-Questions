package com.nayek.DP;

public class LongestCommonSubsequence {

	public int lcs(char[] x, char[] y, int m, int n) {

		int[][] dpTab = new int[m + 1][n + 1];

		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {

				if (i == 0 || j == 0) {
					dpTab[i][j] = 0;
				} else if (x[i - 1] == y[j - 1]) {
					dpTab[i][j] = 1 + dpTab[i - 1][j - 1];
				} else {
					dpTab[i][j] = Math.max(dpTab[i - 1][j], dpTab[i][j - 1]);
				}
			}
		}
		return dpTab[m][n];
	}

	public static void main(String[] args) {
		LongestCommonSubsequence lcs = new LongestCommonSubsequence();
		String s1 = "AGGTAB";
		String s2 = "GXTXAYB";
		char[] x = s1.toCharArray();
		char[] y = s2.toCharArray();
		int m = s1.length();
		int n = s2.length();
		System.out.println(lcs.lcs(x, y, m, n));

	}

}
