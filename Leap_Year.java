import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        String result = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))?"YES" : "NO";
        System.out.println(result);
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
