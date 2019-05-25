// Java program to convert 
// a number from any base 
// to decimal 
import java.io.*; 

class AnyToAny 
{ 

  // To return value of a char. 
  // For example, 2 is returned 
  // for '2'. 10 is returned 
  // for 'A', 11 for 'B' 
  static long val(char c) 
  { 
    if (c >= '0' && c <= '9') 
      return (int)c - '0'; 
    else
      return (int)c - 'A' + 10; 
  } 

  // To return char for a value. For 
  // example '2' is returned for 2. 
  // 'A' is returned for 10. 'B' for 11 
  static char reVal(long num) 
  { 
    if (num >= 0 && num <= 9) 
      return (char)(num + 48); 
    else
      return (char)(num - 10 + 65); 
  } 

  // Function to convert a 
  // number from given base to another given base
  static String toAny(String str, long base1, long base2) 
  { 

    // To Decimal

    int len = str.length(); 
    long power = 1; // Initialize 
          // power of base 
    long num = 0; // Initialize result 
    int i; 

    // Decimal equivalent is 
    // str[len-1]*1 + str[len-1] * 
    // base + str[len-1]*(base^2) + ... 
    for (i = len - 1; i >= 0; i--) 
    { 
      // A digit in input number 
      // must be less than 
      // number's base 
      if (val(str.charAt(i)) >= base1) 
      { 
        return "not possible"; 
      } 

      num += val(str.charAt(i)) * power; 
      power = power * base1; 
    } 

    // To Any Base

    String s = ""; 

    // Convert input number is given 
    // base by repeatedly dividing it 
    // by base and taking remainder 
    while (num > 0) 
    { 
      s += reVal(num % base2); 
      num /= base2; 
    } 
    StringBuilder ix = new StringBuilder(); 

      // append a string into StringBuilder input1 
      ix.append(s); 

    // Reverse the result 
    return new String(ix.reverse()); 
  } 



  // Driver code 
  public static void main (String[] args) 
  { 

    // Base 16 to Base 2
    String str = "11A"; 
    long base1 = 16; 
    long base2 = 2;
    System.out.println("Base equivalent of "+ 
              str + " in base "+ base2 + " from base "+
              base1 + " is "+ 
                toAny(str, base1, base2)); 

    // Base 10 to Base 10
    str = "100"; 
    base1 = 10; 
    base2 = 10;
    System.out.println("Base equivalent of "+ 
              str + " in base "+ base2 + " from base "+
              base1 + " is "+ 
                toAny(str, base1, base2)); 


    // conversion Base 8 to Base 10
    // max int is 2147483647
    // input = 2147483648
    // expected output = 2147483648
    // not possible with int but possible with long
    str = "20000000000"; 
    base1 = 8; 
    base2 = 10;
    System.out.println("Base equivalent of "+ 
              str + " in base "+ base2 + " from base "+
              base1 + " is "+ 
                toAny(str, base1, base2)); 


    // conversion Base 8 to Base 10
    // max long is 9,223,372,036,854,775,807
    // input = 9,223,372,036,854,775,808
    // expected output = 9,223,372,036,854,775,808
    // not possible with long but possible with BigInteger
    str = "1000000000000000000000"; 
    base1 = 8; 
    base2 = 10;
    System.out.println("Base equivalent of "+ 
              str + " in base "+ base2 + " from base "+
              base1 + " is "+ 
                toAny(str, base1, base2)); 
  }   
}
