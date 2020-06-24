import java.util.*;
import java.math.BigInteger;
//A class to contain the various search functions. 
public class search {
    //Linear search
    public int linear(List<BigInteger> l, BigInteger target)
    {for(int i=0;i<l.size();i++)
        {
            if(l.get(i).compareTo(target)==0)
                {
                    return i;
                }
        }
    return -1;
    }
    //Binary Search
    //Since our data is an ordered list of numbers, we can use binary search
    public int binary(List<BigInteger> l, BigInteger target)
    {
        int rightbound = 0;
        int leftbound = l.size()-1;
        int mid = 0;
        while(leftbound>=rightbound)
        {
            mid = (rightbound+leftbound)/2;
            if(l.get(mid).compareTo(target)==0)
                {return mid;}
            else if(l.get(mid).compareTo(target)==-1)
                {rightbound=mid+1;}
            else if(l.get(mid).compareTo(target)==1)
                {leftbound=mid-1;}
            
        }
        return -1;
    }
    public List<BigInteger> removelinear(List<BigInteger> l, BigInteger target)
    {   
        int index = linear(l,target);
        if(index==-1)
        {
            return l;
        }
        else if(index<l.size()&&index>=0)
        {   
            l.remove(index);
            return l;
        }
        else 
        {
            System.out.println("Bound error at removelinear, the target index out of bounds.");
            return l;
        }

    }
    public List<BigInteger> removebinary(List<BigInteger> l, BigInteger target)
    {   
        int index = binary(l,target);
        if(index==-1)
        {
            return l;
        }
        else if(index<l.size()&&index>=0)
        {   
            l.remove(index);
            return l;
        }
        else 
        {
            System.out.println("Bound error at removebinary, the target index out of bounds.");
            return l;
        }

    }
}