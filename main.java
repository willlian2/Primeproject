import java.util.*;
import java.math.BigInteger;

public class main {
    public static void main(String[] args)
    {
        
        List<BigInteger> l1 = new ArrayList<BigInteger>();
        for(int i=0;i<=10;i++)
        {
            BigInteger temp = new BigInteger(Integer.toString(i));
            l1.add(temp);
        }
        search s = new search();
        BigInteger b0 = new BigInteger("0");
        BigInteger b5 = new BigInteger("5");
        BigInteger b7 = new BigInteger("7");
        BigInteger b10 = new BigInteger("10");
        
        sieve seve = new sieve();
        System.out.println(seve.Eratosthenes(b10));

        
       
        
    }
}
