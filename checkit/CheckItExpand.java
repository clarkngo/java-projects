// Introduction to Software Testing
// Authors: Paul Ammann & Jeff Offutt
// Chapter 8; page ??
// Can be run from command line
// No JUnit tests at this time

public class CheckItExpand
{

   public static void checkItExpand (boolean a, boolean b, boolean c)
   {  
    //  if (a && (b || c))
      if (b)
      {
        System.out.print("b is true and ");
        if (a)
        {
          System.out.println("a is true, then P is true");
        }
        else
        {
          System.out.println ("a is false, then P isn't true");
        }              
      }
      else if (c)
      {
        if (a)
        {
          System.out.println ("c is true and a is true, then P is true");
        }
        else
        {
          System.out.println ("c is true and a is false, then P isn't true");
        }              
      }      
      else
      {
        System.out.println ("b is false and c is false, then P isn't true");
      }      
   }
   
   public static void main (String []argv)
   {  // Driver method for checkIt
      // Read an array from standard input, call checkIt()
      boolean []inArr = new boolean [argv.length];
      if (argv.length != 3)
      {
         System.out.println ("Usage: java checkIt v1 v2 v3");
         return;
      }
   
      for (int i = 0; i< argv.length; i++)
      {
         inArr [i] = Boolean.parseBoolean(argv[i]);
      }
   
      checkItExpand (inArr[0], inArr[1], inArr[2]);
   }
}
