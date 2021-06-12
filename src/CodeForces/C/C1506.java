package C;

import java.io.*;

public class C1506 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        if(br.ready()){
            int T = Integer.parseInt(br.readLine());
            for(int t = 1; t <= T ; t++) {
                String as = br.readLine();
                String bs = br.readLine();
                int maxSubsequence = LCSUtil(as,bs);
                System.out.println(as.length() + bs.length() - 2*maxSubsequence);
            }
        }
    }

    private static int LCSUtil(String a, String b){
        int lenA = a.length();
        int lenB = b.length();
        int lookup[][] = new int[lenA+1][lenB+1];
        int ans = 0;
        for(int i = 0; i <= lenA; i++){
            for(int j = 0; j <= lenB ; j++){
                if(i == 0 || j == 0){
                    lookup[i][j] = 0;
                } else if (a.charAt(i-1) == b.charAt(j-1)){
                    lookup[i][j] = lookup[i-1][j-1] + 1;
                    ans = Math.max(ans, lookup[i][j]);
                } else {
                    // lookup[i][j] = Math.max(lookup[i-1][j], lookup[i][j-1]);
                    lookup[i][j] = 0;
                }
            }
        }
        return ans;
    }

}
