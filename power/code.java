
import java.io.*;

class GFG {
    public static long sq(int n,int m){
        if(m==0){
            return 1;
        }
        else{
            long half = sq(n,m/2);
            if(m%2 == 0){
                return half*half;
            }
            else{
                return half*half*n;
            }
        }
    }
	public static void main (String[] args) {
		System.out.println(sq(2,54));
	}
}
