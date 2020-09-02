package ALpractice.DP.simple.longestCommonSubsequence;

public class LCS {
    public String LCS (String s1, String s2) {
        int s1Length = s1.length();
        int s2Length = s2.length();
        int [][] dp = new int[s1Length+1][s2Length+1];

        for (int i=1; i<s1Length; i++){
            for(int j=1; j<s2Length; j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    dp[i][j] = dp[i][j-1]+1;
                }else{
                    dp[i][j] = dp[i][j-1];
                }
            }
        }
        StringBuffer str = new StringBuffer();
        int LISlength = dp[s1Length+1][s2Length+1];
        int temp = dp[s1Length+1][s2Length+1];
        for (int i=s1Length; i>0;i--){
            for(int j=s2Length; j>0; j--){
                if(dp[i][j]<temp){
                    temp = dp[i][j];
                    str.insert(0,s1.charAt(i));
                }
            }
        }

        return str.toString();
    }
}
