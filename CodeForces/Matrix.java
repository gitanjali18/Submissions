import java.util.*;
import java.lang.*;
public class Matrix{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[][] a= new int[5][5];
        int count = 0;
        for(int i =0; i<5;++i){
            for(int j=0;j<5;++j){
                a[i][j]=scan.nextInt();
            }
        }
            for(int i=0;i<5;++i){
                for(int j=0;j<5;++j){
                    if(a[i][j]==1){
                        count=Math.abs(i-2)+Math.abs(j-2);
                    }
                }
            }
        
      System.out.println(count);
    }  
}