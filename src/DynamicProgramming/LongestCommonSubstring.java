public class LongestCommonSubstring {
    public static int LCSUtil(String first, String second){
        int firstLength = first.length();
        int secondLength = second.length();
        int lookUpTable[][] = new int[firstLength+1][secondLength+1];
        int answer = 0;
        for(int indexFirst = 0; indexFirst <= firstLength; indexFirst++){
            for(int indexSecond = 0; indexSecond <= secondLength; indexSecond++){
                if(indexFirst == 0 || indexSecond == 0){
                    lookUpTable[indexFirst][indexSecond] = 0;
                } else if(first.charAt(indexFirst-1) == second.charAt(indexSecond-1)) {
                    lookUpTable[indexFirst][indexSecond] = lookUpTable[indexFirst-1][indexSecond-1] + 1;
                    answer = Math.max(answer, lookUpTable[indexFirst][indexSecond]);
                } else {
                    lookUpTable[indexFirst][indexSecond] = 0;
                }
            }
        }
        return answer;
    }
}
