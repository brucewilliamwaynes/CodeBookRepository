/* package codechef; // don't place package name! */

import java.io.*;
import java.math.BigInteger;

/* Name of the class has to be "Main" only if the class is public. */
public class BuildAPair
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		if(br.ready()){
		    int T = Integer.parseInt(br.readLine());
		    for(int t = 0; t < T; t++){
		        String inputs[] = br.readLine().split(" ");
		        int D = Integer.parseInt(inputs[0]);
		        int d = Integer.parseInt(inputs[1]);
		        int P = Integer.parseInt(inputs[2]);
		        int Q = Integer.parseInt(inputs[3]);
		        // int k = Integer.parseInt(inputs[4]);
                int divisibleDays = D/d;
				int remainderDays = D%d;
				BigInteger firstPart;
				BigInteger secondPart;
				BigInteger divDaysPart;
				BigInteger divPricePart;
				if(divisibleDays % 2 == 0) {
					divDaysPart = BigInteger.valueOf(divisibleDays/2);
					firstPart = divDaysPart.multiply(BigInteger.valueOf(d));
					divDaysPart = BigInteger.valueOf(divisibleDays - 1);
					divPricePart = divDaysPart.multiply(BigInteger.valueOf(Q));
					secondPart = divPricePart.add(BigInteger.valueOf(2*P));
				} else {
					divDaysPart = BigInteger.valueOf(divisibleDays);
					firstPart = divDaysPart.multiply(BigInteger.valueOf(d));
					divDaysPart = BigInteger.valueOf((divisibleDays - 1) / 2);
					divPricePart = divDaysPart.multiply(BigInteger.valueOf(Q));
					secondPart = divPricePart.add(BigInteger.valueOf(P));
				}
				// BigDecimal firstPart = BigDecimal.valueOf(divisibleDays * d);
				// BigDecimal secondPart = BigDecimal.valueOf(P + ((divisibleDays - 1) * Q)/ 2.0);
				BigInteger finalPart = firstPart.multiply(secondPart);
				divDaysPart = BigInteger.valueOf(divisibleDays);
				divPricePart = divDaysPart.multiply(BigInteger.valueOf(Q));
				divPricePart = divPricePart.add(BigInteger.valueOf(P));
				BigInteger remainderPart = divPricePart.multiply(BigInteger.valueOf(remainderDays));
				BigInteger finalAnswer = finalPart.add(remainderPart);
				System.out.println(finalAnswer);
		    }
		}
	}
}
