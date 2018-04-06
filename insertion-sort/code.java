/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    public static void insertion(int[] a){
        int len = a.length;
        for(int i=1;i<len;i++){
            int temp = a[i];
            int j = i-1;
            while(j >= 0 && a[j] >= temp){
                a[j+1] = a[j--];
            }
            a[j+1] = temp;
        }
    }
	public static void main (String[] args) {
          int a[] = {3,7,4,5,6,2,4,8,34};
          insertion(a);
          System.out.println(Arrays.toString(a));
	}
}
