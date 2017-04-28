import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    byte T;
    long n;
    int s1 = 1000000007;
    T=input.nextByte();
    for(int i=0;i<T;i++)
        {n=0;
        n=input.nextLong();
         
        System.out.println((n*n)%s1);
        }    }
}
