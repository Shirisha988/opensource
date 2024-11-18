import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        if (x> z){
            System.out.println(0);
            
        }
        else if (x + y <= z) {
            System.out.println(2);
            
        }else {
            System.out.println(1);
        }
        scanner.close();
       
    }
}
