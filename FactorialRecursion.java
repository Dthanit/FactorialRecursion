import java.util.Scanner;
class FactorialRecursion
 {
   public static void getCalculationfac()
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Calculation Factorial ");
      System.out.print("Enter  n : ");
      int result = 1;
      int n = scan.nextInt(); 
      for (int i = n; i >= 1; i--) 
      { 
        result *= i; 
      }
         System.out.println("Result = " + result); 
    }
    public static void main(String[] args)
    {
      int n = 0;int result = 1;
      getCalculationfac();
    }
}
