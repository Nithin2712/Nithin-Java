import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Task9 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int lineNumber = 0;
        while(sc.hasNext())
        {
            lineNumber++;
            System.out.println(""+lineNumber+" "+sc.nextLine());
        }
    }
}