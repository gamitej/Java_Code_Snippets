//code of HashMap for counting Integer...

import java.util.*;

public static void main(String[] args){
 HashMap<Integer, Integer> m 
     = new HashMap<Integer, Integer>();
  
        int[] ar = {-3,5,6,4,5,-3};
        int l = ar.length;
        
        for (int i=0;i<l;i++) {
            if (m.containsKey(ar[i])) {
                m.put(ar[i],m.get(ar[i]) + 1);
            }
            else {
                m.put(ar[i], 1);
            }
        }
         
        for (Map.Entry i : m.entrySet()) {
            int x = (int)i.getKey();
            int y = (int)i.getValue();
            System.out.println(x + " " + y);
        }
    }
}    
---------------------------------------------------------------------------------------------
//code of HashMap for counting String...

import java.util.*;

public static void main(String[] args){
 HashMap<String, Integer> m
            = new HashMap<String, Integer>();
  
        String[] ar = {"sam","kam","lam","sam","sam","kam"};
        int l = ar.length;
        
        for (int i=0;i<l;i++) {
            if (m.containsKey(ar[i])) {
                m.put(ar[i],m.get(ar[i]) + 1);
            }
            else {
                m.put(ar[i], 1);
            }
        }
         
        for (Map.Entry i : m.entrySet()) {
            String x = (String)i.getKey();
            int y = (int)i.getValue();
            System.out.println(x + " " + y);
        }
    }
}    
    
--------------------------------------------------------------------------------------------

//code of HashMap for counting character...

import java.util.*;

public static void main(String[] args){ 
        HashMap<Character, Integer> m
            = new HashMap<Character, Integer>();
            
        String str = "amisha";
        char[] arr = str.toCharArray();
  
        //for (char c : arr) 
        for(int i=0;i<arr.length;i++){
            char c = arr[i];
            if (m.containsKey(c)) {
                m.put(c, m.get(c) + 1);
            }
            else {
                m.put(c, 1);
            }
        }
         
        for (Map.Entry i : m.entrySet()) {
            char x = (char)i.getKey();
            int y = (int)i.getValue();
            System.out.println(x + " " + y);
        }
    }
}    
---------------------------------------------------------------------------------------------
//code for GCD and LCM....

import java.util.*;

public class Solution {
    public static int gcd(int a, int b)
    {
      if (b == 0)
        return a;
      return gcd(b, a % b);
    }
     
    public static void main(String[] args)
    {
        int a = 5, b = 7;
        int ans = gcd(a,b);
        System.out.println("GCD IS:- "+ans);
        
         // for lcm
        int v = (a*b)/ans;
        System.out.println("LCM IS:- "+v);
    }
}

---------------------------------------------------------------------------------------------
//code for prime number...

import java.util.*;

public class Solution {
  
    public static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;

        else if (n == 2)
            return true;
 
        else if (n % 2 == 0)
            return false;
 
        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }
 
    public static void main(String[] args)
    {
        int n = 11;
        if (isPrime(n))
            System.out.println(n+" is prime");
        else
            System.out.println(n+" is not prime");
    }
}
---------------------------------------------------------------------------------------------
// code for finding sum of number...

import java.util.*;

public class Solution {
  
    public static int getSum(int n)
    {    
        int sum = 0;
        while (n != 0)
        {
            sum = sum + n % 10;
            n = n/10;
        }
    return sum;
    }
  
    public static void main(String[] args)
    {
        int n = 123;
        System.out.println(getSum(n));
    }
}
---------------------------------------------------------------------------------------------
// code for decimal places...

import java.util.*;
public class Solution {
  
    public static void main(String[] args) {

    double n = 0.3;
 
    // precision to 2 places
    System.out.println(
    String.format("%.2f", n));
 
    double m = 12;
 
    // precision to 7 places
    System.out.println(
    String.format("%.7f", m));
  }
}
---------------------------------------------------------------------------------------------
// code for finding ASCII value...

import java.util.*;
public class Solution {
  
      public static void main(String[] args)
    {
        char c1 = 'A', c2 = 'a';
        int ans1 = (int)c1;
        int ans2 = (int)c2;
        System.out.println("The ASCII value of "+c1+" "+ans1);
        System.out.println("The ASCII value of "+c2+" "+ans2);
    }
}
---------------------------------------------------------------------------------------------
/* code for string to string[] in word form,  
*  code for string to character,
*  code for string to string[] in single string form.. 
*/ 
import java.util.*;

public class Solution {
  
      public static void main(String[] args)
    {
        String str = "kya baat hai";
        
        // to get string array..
        String[] ar = str.split(" ");
        System.out.println("String array values..");
         
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
        
        // to get each values from string..
        String[] br = str.split("");
        System.out.println("\n\nEach string array values..");
       
        for(int i=0;i<br.length;i++){
            // the ouput will be string
            System.out.print(br[i]+" ");
        }
        
        // to get each value in character form...
        System.out.println("\n\nEach character from string str..");
        
        for(int i=0;i<str.length();i++){
            char x = str.charAt(i);
            System.out.print(x+" ");
        }
        
    }
}
---------------------------------------------------------------------------------------------
// code for sorting the array..

// interger array
import java.util.*;
public class Solution {
  
      public static void main(String[] args)
    {
        int[] ar = {5,4,3,2,1};
        
        Arrays.sort(ar);
        
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }        
    }
}

// string array
import java.util.*;
public class Solution {
  
      public static void main(String[] args)
    {
        String[] ar = {"sam","gam","ram","kam","lam"};
        
        Arrays.sort(ar);
        
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }        
    }
}

// char array

import java.util.*;
public class Solution {
  
      public static void main(String[] args)
    {
        char[] ar = {'a','z','b','d','c'};
        
        Arrays.sort(ar);
        
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }        
    }
}
---------------------------------------------------------------------------------------------
