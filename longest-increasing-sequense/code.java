import java.util.*;
class GFG {
    
	public static void longest(int[] a,int[] t){
	    for(int i=0;i<t.length;i++){
	        t[i] = 1;
	    }
	    
	    for(int i=0;i<a.length;i++)
	    {
	        for(int j=0;j<i;j++)
	        {
	            if(a[j] < a[i] && t[i] < t[j]+1)
	            {
	                t[i] = t[j]+1;  
	            }
	        }
	    }
	}
	
	public static void reverse(int[] re){
	    int n = re.length;
	    if(n!=0){
	        for(int i=0;i<n;i++)
	        System.out.print(re[i]+" ");
	    }
	}
	
	public static void printar(int[] t,int[] a){
	    int max=t[0];
	    int in=0;
	    for(int i=0;i<t.length;i++)
	    {
	        if(t[i] > max)
	        {
	        max = t[i];
	        in = i;
	        }
	    }
	    int[] re = new int[max];
	    int l = max;
	    
	    for(int i = in; i >= 0 && l >= 0; i--)
	    {
	        if(t[i] == l){
	            re[l-1] = a[i];
	            l--;
	        }
	    }
	    
	    reverse(re);
	}
	
	// Driver code
	public static void main (String[] args) 
	{
	int[] a={4,6,5,2,7,8,3,9,2,13};
	int[] t= new int[a.length];
	longest(a,t);
	printar(t,a);
	}
}
