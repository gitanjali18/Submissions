import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner userInput = new Scanner(System.in);
	    int t;
	    t= userInput.nextInt();
	    while(t!=0){
	        int a=userInput.nextInt();
	        int b=userInput.nextInt();
	        if(a>b){
	            System.out.println(">");
	        }else if(a<b){
	            System.out.println("<");
	        }else{
	            System.out.println("=");
	        }
	        --t;
	    }
	}
}
