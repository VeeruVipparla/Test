package com.testing;

public class Test {
	public static void main(String[] args) {
		String str1 = "helloworld";
		String str2 = "hello";
		String str3 = "Welocomehello";
		Test lcsMain = new Test();
		System.out.println("Longest common subString is: " + lcsMain.getTest(str1, str2, str3));
	}

	public String getTest(String str1, String str2, String str3) {
		int m = str1.length();
		int n = str2.length();
		int o = str3.length();
		int max = 0;
		int[][][] dp = new int[m][n][o];
		int endIndex = -1;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < o; o++) {
					if (str1.charAt(i) == str2.charAt(j) == str3.charAt(k)) {
						if (i == 0 || j == 0 || k == 0) {
							dp[i][j][k] = 1;
						} else {
							dp[i][j][k] = dp[i - 1][j - 1][k - 1] + 1;
						}
						if (max < dp[i][j][k]) {
							max = dp[i][j][k];
							endIndex = i;
						}
					}
				}
			}
		}
		return str1.substring(endIndex - max + 1, endIndex + 1);
	}
}