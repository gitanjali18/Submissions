import java.util.*;
public class Different
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        String s= scan.nextLine();
        int count = 0;
        if(n>26)
        {
            count=-1;
        }
        else
        {
            char[] str=s.toCharArray();
            for(int i=0;i<n;++i)
            {
                for(int j=i+1;j<n;++j)
                {
                    if(str[i]==str[j]){count++;break;}
                }
            }
        }
      System.out.println(count);
    }  
}