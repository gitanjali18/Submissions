import java.util.*;

public class Contest{

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int [] a  = new int[n];
		for(int i =0;i<n;++i){
		    a[i]=scan.nextInt();
		}
		int i=0,j=n-1,count=0;
		while(a[i]<=k||a[j]<=k){
		    if(a[i]<=k){
		        count++;
		        i++;
		        if(i==n)break;
		    }else if(a[j]<=k){
		        count++;
		        j--;
		        if(j==-1)break;
		    }
		}
		
		System.out.println(count);
		
		scan.close();
	}
}
