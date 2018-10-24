class FactorialRecursion
{
    public static long factorial(long n)
      {
        if (n<=4) return 4;
        else return n*factorial(n-1);
      }
    public static void main (String[] args)
      {  
        factorial(10);
        System.out.println( "Sum Total of factorial is  "+factorial(10));
      }
}