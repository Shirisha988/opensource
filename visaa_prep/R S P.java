import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char vignesh = scanner.next().charAt(0);
        char charan = scanner.next().charAt(0);
        String winner = (vignesh == charan) ? "NULL":
        (vignesh == 'R' && charan == 'S' || vignesh == 'P' && charan == 'R' || vignesh == 'S'&& charan == 'P')?"Vignesh":"Charan";
        System.out.println(winner);
        scanner.close();
        
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
