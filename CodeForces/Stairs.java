import java.util.*;

public class Stairs{

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i = 0;i<n;++i){
			a[i] = scan.nextInt();
		}
		int c=0;
		for(int i= 0; i<n;++i){
		    if(a[i]==1)c++;
		}
		System.out.println(c);
		if(n==1)System.out.print("1");
		else{
	    	for(int i = 1;i<n;++i){
		        if(a[i]==1)System.out.print(a[i-1]+" ");
		        if(i==n-1)System.out.print(a[i]+" ");
		    
	    	}
		}
		scan.close();
	}
}
