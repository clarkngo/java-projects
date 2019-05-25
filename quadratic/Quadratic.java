// Program to compute the quadratic root for two numbers
import java.lang.Math;

class Quadratic 
{
  private static float Root1, Root2;

  public static void main (String[] argv)
  {
    int X, Y, Z;
    boolean ok;
    int controlFlag = Integer.parseInt(argv[0]);
    if (controlFlag == 1)
    {
      X = Integer.parseInt(argv[1]);
      Y = Integer.parseInt(argv[2]);
      Z = Integer.parseInt(argv[3]);
    }
    else 
    {
      X = 10;
      Y = 9;
      Z = 12;
    }
    ok = Root(X,Y,Z);
    if (ok)
      System.out.println
      ("Quadratic: " + Root1 + Root2);
    else 
      System.out.println("No Solution.");
  }

  // Three positive integers, finds quadratic root
  private static boolean Root(int A, int B, int  C)
  {
    double D;
    boolean Result;
    D = (double)(B*B) - (double)(4.0*A*C);
    if (D < 0.0)
    {
      Result = false;
      return (Result);
    }
    Root1 = (double)((-B + Math.sqrt(D))/(2.0*A));
    Root2 = (double)((-B - Math.sqrt(D))/(2.0*A));
    Result = true;
    return (Result);
  } // End method Root
} // End class Quadratic
