import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class table {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());
        int n = 2;
        /*from w ww .  ja v  a 2s  .co  m*/
        int sum;
        
        for(int i = 1; i <= 10; i++){
            sum = n * i;
            System.out.println(n + " x " + i + " = " + sum);
        }
        bufferedReader.close();
    }
}
