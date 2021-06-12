public class LongestCommonSubsequence {
    public static int LCSUtil(String first, String second) {
        int lengthFirst = first.length();
        int lengthSecond = second.length();

        int lookUpTable[][] = new int[lengthFirst+1][lengthSecond+1];

        for(int indexFirst = 0; indexFirst <= lengthFirst; indexFirst++) {
            for(int indexSecond = 0; indexSecond <= lengthSecond; indexSecond++) {
                if(indexFirst == 0 || indexSecond == 0){
                    lookUpTable[indexFirst][indexSecond] = 0;
                } else if(first.charAt(indexFirst-1) ==  second.charAt(indexSecond-1)){
                    lookUpTable[indexFirst][indexSecond] = lookUpTable[indexFirst-1][indexSecond-1] + 1;
                } else {
                    lookUpTable[indexFirst][indexSecond] = Math.max(lookUpTable[indexFirst-1][indexSecond], lookUpTable[indexFirst][indexSecond-1]);
                }
            }
        }
        return lookUpTable[lengthFirst][lengthSecond];
    }
}
