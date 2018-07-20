import java.io.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Watermelon{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int w;
        w = scan.nextInt();
        if(w==2){
            System.out.println("NO");
        }
        else if(w%2==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}

