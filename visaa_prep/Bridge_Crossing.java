import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        
        int maxMangoes = z < y ? 0 : (z - y) / x;
        System.out.println(maxMangoes);
        scanner.close();
            
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
