/*package whatever //do not write package name here */
import java.util.*;
import java.io.*;

class GFG {
    public static int max(int a,int b)
    {
        if (a>b)
            return a;
        return b;
    }
    public static void findmax(int[] a){
        int maxsum = a[0];
        int cursum = 0;
       int prvsum = 0;
       int end = 0,start=0;
        for(int i=0;i<a.length;i++){
        
            prvsum  = max(prvsum+a[i],a[i]);
           
            maxsum = max(maxsum,prvsum);
            if(maxsum == a[i])
            {
                start =i;
                end = i;
            }
            else if(maxsum == prvsum)
            {
                end = i;
    
            }
        }
        for(int k = start;k<=end;k++){
            System.out.print(a[k]+" ");
        }
        System.out.println("-->"+maxsum);
    }
	public static void main (String[] args) {
		int[] a = {-2,11,-4,13,-5,2};
		//int[] a = {1,-3,4,-2,-1,6};
		findmax(a);
		
			}
}
