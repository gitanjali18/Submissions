import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int t;
        t=scan.nextInt();
        scan.nextLine();
        while(t>0){
            String str;
            str = scan.nextLine();
            char[] s= str.toCharArray();
            for(int i =0;i<str.length();i+=2){
                System.out.print(s[i]);
            }
            System.out.print(" ");
            for(int i=1;i<str.length();i+=2 ){
                System.out.print(s[i]);
            }
            System.out.println();
            t--;
            
        }
        
    }
}