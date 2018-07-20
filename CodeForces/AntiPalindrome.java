import java.util.*;

public class AntiPalindrome{
    
    public static boolean isPalindrome(String s){
        for(int i = 0;i<s.length();++i){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int len = s.length();
        while(isPalindrome(s.substring(0,len))&&len!=0){
            len--;
        }
        System.out.println(len);
    }
    
}
