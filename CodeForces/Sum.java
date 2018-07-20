import java.util.*;

public class Sum{

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int sum =0,f=0,s=1;
		for(int i=0;i<n;++i){
		    int temp=f;
		    f=s;
		    s=temp+s;
		    sum+=f;
		}
		System.out.println(sum);
		
		scan.close();
	}
}
