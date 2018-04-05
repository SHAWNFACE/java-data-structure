/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
    public static void quicksort(int[] a,int l,int r,int k){
        if(l<=r){
            int pivot = partition(a,l,r);
            if(pivot == a.length-k){
                System.out.println(a[pivot]);
            }
            else if(pivot < a.length-k){
            quicksort(a,pivot+1,r,k);    
            }
            else{
            quicksort(a,l,pivot-1,k);
            }
            
        }
    }
    public static void kthlar(int[] a,int k){
        if(k>=1 && k<=a.length){
            int l=0;
            int r=a.length-1;
            while(true){
            int pivot = partition(a,l,r);
            if(pivot == a.length-k){
                System.out.println("---->"+a[pivot]);
                break;
            }
            else if(pivot > k){
                r = pivot-1;
                
            }
            else if(pivot <k){
                l = pivot+1;
            }
            }
            
        }
    }
    public static int partition(int[] a,int l,int r){
        if(l==r)
        return l;
        int ptr = l;
        int pivot = a[l];
        
        for(int i=l+1;i<=r;i++){
            if(a[i]<=pivot){
                ptr++;
                int temp=a[ptr];
                a[ptr]= a[i];
                a[i]= temp;
                
            }
        }
            int temp = a[ptr];
            a[ptr]= pivot;
            a[l] = temp;
            return ptr;
        
    }
	public static void main (String[] args) {
		int[] a={4,7,2,6,8,1,34,23,1,12};
		//kthlar(a,8);
		quicksort(a,0,a.length-1,10);
		System.out.println(Arrays.toString(a));
	}
}
