/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    public static void quicksort(int[] a,int l,int r)
    {
        if(l<r){
            int pivot = partition(a,l,r);
            System.out.println("pivot:"+pivot);
            quicksort(a,l,pivot-1);
            quicksort(a,pivot+1,r);
            
        }
    }
    
    public static int partition(int[] a,int l,int r){
        int pivot = a[l];
        int start = l;
        int end = r;
        while(start<end){
            while(start < end && a[start] < pivot){
                start++;
            }
            while(start < end && a[end] >= pivot)
            {
                end--;
            }
            if(start < end){
                System.out.println("swap");
                System.out.println(a[start]+","+a[end]);
                
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
        }
        
        a[l] = a[start];
        a[start] = pivot;
        return start;
    }
	public static void main (String[] args) {
		int[] a = {4,7,8,3,2,5,34,65,23};
		quicksort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}
}
