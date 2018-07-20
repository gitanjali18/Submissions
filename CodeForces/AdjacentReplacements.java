import java.util.*;

public class AdjacentReplacements{

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i = 0;i<n;++i){
			a[i] = scan.nextInt();
		}
		int pos=0, max = a[0];
		for(int i = 1;i<n;++i){
		    if(a[i]>max){
		        max=a[i];
		        pos=i;
		    }
		}
		if(max%2!=0){
		    ++a[pos];
		}
		for(int i = 0;i<n;++i){
		    if(a[i]%2==0)--a[i];
		}
		
		for(int i=0;i<n;++i){
		    System.out.print(a[i]+" ");
		}
		scan.close();
	}
}
