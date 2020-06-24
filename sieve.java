import java.util.*;
import java.math.BigInteger;
public class sieve {
    public List<BigInteger> Eratosthenes( BigInteger n)
    {   
        BigInteger p = new BigInteger("2");
        search s = new search();
        BigInteger intlistmax = new BigInteger("2147483647");
        if(n.compareTo(intlistmax)==-1)
        {   
            BigInteger b1 = new BigInteger("1");
            BigInteger b2 = new BigInteger("2");
            //create a list of all ints from 2-n
            List<BigInteger> all = new ArrayList<BigInteger>();
            for(BigInteger i=new BigInteger("2");i.compareTo(n)==-1||i.compareTo(n)==0;i=i.add(b1))
            {
                all.add(i);
            }
            List<BigInteger> primes = new ArrayList<BigInteger>();
            while(p.compareTo(n)==-1)
            {
                List<BigInteger> marked = new ArrayList<BigInteger>();
                //since we don't want to mark p, start the marking process at 2p
                
                for(BigInteger pstep = p.multiply(b2); pstep.compareTo(n)==-1;pstep=pstep.add(p))
                {
                    
                    marked.add(pstep);
                    
                }
                for(int i=0;i<marked.size();i++)
                {
                    s.removelinear(all,marked.get(i));
                }   
                //adds p to the list of primes 
                
                    primes.add(all.get(0));
                    all.remove(0);
                    System.out.println(p);
                    p = all.get(0);
                
            }
            return primes;
        }
        else
        {List<BigInteger> all = new ArrayList<BigInteger>();
            for(int i=2;i<=n.intValue();i++)
            {
                BigInteger temp = new BigInteger(Integer.toString(i));
                all.add(temp);
            }
        return all;
        }
    }

}