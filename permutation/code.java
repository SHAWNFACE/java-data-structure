
import java.util.*;
class GFG {
    static Hashtable<String,Integer> h = new Hashtable<String,Integer>(); 
	public static void printarray(char[] ch)
	{
	    for(int i=0;i<ch.length;i++){
	        System.out.print(ch[i]);
	    }
	    System.out.println();
	}
	public static void swap(char[] ch,int i,int j)
	{
	   char temp=ch[i];
	   ch[i]=ch[j];
	   ch[j]=temp;
	}
	public static void per(char[] ch,int l,int r)
	{
	    if(l==r)
	    {
	        
	        boolean re = check(Arrays.toString(ch));
	        if (re == false){
	        printarray(ch);
	        }
	    }
	    else{
	        for(int i=l;i<=r;i++)
	        {
	            swap(ch,l,i);
	            per(ch,l+1,r);
	            swap(ch,l,i);
	        }
	    }
	}
	public static boolean check(String str){
	    if(h.containsKey(str) == true){
	        return true;
	    }
	    else{
	        h.put(str,1);
	        return false;
	    }
	}
	// Driver code
	public static void main (String[] args) 
	{
	
	Scanner in = new Scanner(System.in);
	String str = in.nextLine();
	char[] ch = str.toCharArray();
	//System.out.println(str);
	per(ch,0,ch.length-1);
	}
}

