//common sub sequence

import java.io.*;
import java.util.*;

class GFG {
    public static void print(int[][] a){
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void findCommon(String str1,String str2){
        int i = str2.length();
        int j = str1.length();
        //System.out.println(i+","+j);
        int[][] a = new int[i+1][j+1];
         //print(a);
        for(int m = 0; m<=j;m++){
            a[0][m] = 0;
        }
        for(int m = 0; m<=i;m++){
            a[m][0] = 0;
        }
       
        for(int m=0;m<i;m++)
        {
            for(int n=0;n<j;n++)
            {
                if(str1.charAt(n) == str2.charAt(m))
                {
                    a[m+1][n+1] = a[m][n]+1;
                }
                else{
                    a[m+1][n+1] = max(a[m+1][n],a[m][n+1]);
                }
            }
        }
        StringBuffer s = new StringBuffer();
        for(int m=i,n=j;m>0&&n>0;)
        {
            if(a[m][n] == a[m-1][n]){
            m--;
            }
            else if(a[m][n] == a[m][n-1]){
                n--;
            }
            else if (str1.charAt(n-1) == str2.charAt(m-1)){
                s.append(str1.charAt(n-1));
                m--;
                n--;
                
            }
        }
        //print(a);
        System.out.println(s.reverse().toString());
        
    }
    public static int max(int a,int b){
        if(a>b)
        return a;
        return b;
    }
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		String str1 = "abcbdab";
		String str2 = "bdcaba";
		findCommon(str1,str2);
	}
}
