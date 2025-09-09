09/09/2025


//1.Write a JAVA program to check the values are equal or not:

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  // read first integer
        int b = sc.nextInt();
        if(a==b)
            System.out.print("EQUAL");
        else
            System.out.print("NOT EQUAL");
    }
    
}

//2.Write a C program to check the number is odd or even using conditional construct

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2==0)
            System.out.print("EVEN");
        else
            System.out.print("ODD");
    }
}

//3.Write a JAVA program to determine the sign of the input using conditional constructs.


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>0)
            System.out.println("Positive");
        else if (a<0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
    }
}


//4.Write a JAVA program to check the number is divisible by 3 or not using conditional construct.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int r=a%3;
        if (a%3==0)
            System.out.print("The number is divisible by 3");
        else
            System.out.print("The number is not divisible by 3 and gives a remainder " + r);
        
    }
}

//5. Write a JAVA program to check the number is either divisible by 3 or divisible by 5 and display the corresponding message

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        if((a%3 == 0 )&& (a%5 == 0))
            System.out.print("HiHello");
        else if(a%3==0)
            System.out.print("Hi");
        else if(a%5==0)
            System.out.print("Hello");
        else
            System.out.print(" ");
        sc.close();
    }
    
}

//6.Write a JAVA program to check whether the given year is leap year or not using conditional construct

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        
        if(year%400==0)
            System.out.print("Leap year");
        else if(year%100==0)
            System.out.print("Not a Leap year");
        else if(year%4==0)
            System.out.print("Leap year");
        else
            System.out.print("Not a Leap year");
            
    }
}

CLASS TEST

/*1.Your task is to take two numbers of int data type, two numbers of float data type as input and output their sum:
  Declare variables: two of type int and two of type float. 
  Read lines of input from stdin (according to the sequence given in the 'Input Format' section below) and initialize your variables. 
  Use the and operator to perform the following operations: Print the sum and difference of two int variable on a new line. 
  Print the sum and difference of two float variable rounded to one decimal place on a new line.*/

  import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        float c = sc.nextFloat();
        float d = sc.nextFloat();
        
        int sum = a+b;
        int sub = a-b;
        float add = c+d;
        float dif = c-d;
        System.out.println(sum + " " + sub);
        
        System.out.println(add + " " + dif);
    }
}

/*2.Get 3 numbers from the user , compare the numbers and print Equilateral or Isosceles or Scalene

If all number are same - Equilateral
If any two numbers are same - Isosceles
If all the numbers are different - Scalene*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        
        if((a==b) && (b==c))
        System.out.print("Equilateral");
        else if(a==b||b==c||a==c)
        System.out.print("Isosceles");
        else
        System.out.print("Scalene");
    
        
        }
    
}

/*3.Write a JAVA program to input amount from user and print minimum number of notes (Rs.500,100,50,20,10,5,2,1) required for the given amount in c*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // read amount
        
        int count;
        
        System.out.println("Total number of notes:");
        
        count = n / 500;
        n = n % 500;
        System.out.println("500 : " + count);
        
        count = n / 100;
        n = n % 100;
        System.out.println("100 : " + count);
        
        count = n / 50;
        n = n % 50;
        System.out.println("50 : " + count);
        
        count = n / 20;
        n = n % 20;
        System.out.println("20 : " + count);
        
        count = n / 10;
        n = n % 10;
        System.out.println("10 : " + count);
        
        count = n / 5;
        n = n % 5;
        System.out.println("5 : " + count);
        
        count = n / 2;
        n = n % 2;
        System.out.println("2 : " + count);
        
        count = n / 1;
        n = n % 1;
        System.out.println("1 : " + count);
        
        sc.close();
    }
}

/*4.Basic print new line
Hello world I am a Student*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    
    System.out.print("Hello world \nI am a Student");
    }
}




