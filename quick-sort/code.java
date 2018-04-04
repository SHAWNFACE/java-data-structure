/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    public static void quicksort(int[] a,int l,int r)
    {
        if(l<r){
            int pivot = partition(a,l,r);
            quicksort(a,l,pivot-1);
            quicksort(a,pivot+1,r);
            
        }
    }
    
    public static int partition(int[] a,int l,int r){
        int pivot = a[l];
        int start = l;
        int end = r;
        while(start < end){
            while(start <= end && a[start] <= pivot){
                start++;
            }
            while(start < end && a[end] > pivot)
            {
                end--;
            }
            if(start < end){
               
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
               
            }
        }
        
        a[l] = a[start-1];
        a[start-1] = pivot;
        return start-1;
    }
	public static void main (String[] args) {
		int[] a = {3,7,8,4,5,7,2};
		quicksort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}
}
