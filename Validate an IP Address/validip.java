import java.util.*;
import java.io.*;

  public class validip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            Solution obj = new Solution();

            if (obj.isValid(s))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    
    public boolean isValid(String s) {
        // Write your code here
        String[] arr = s.split("\\.");
        int value = 0;
        if(arr.length != 4) return false;
        if(s.endsWith(".")) return false;
        if(s.length() < 7 || s.length() > 15) return false;
        for(String i: arr){
            try{
                value = Integer.parseInt(i);
                if(value < 0 || value > 255){
                return false;
            }
            if((i.length() > 1) && ( i.charAt(0) == '0')){
                return false;
            }
            }
            catch(NumberFormatException e){
                return false;
            }
            
    }
    return true;
}
}
