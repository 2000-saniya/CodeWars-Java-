public class Factorial {

  public int factorial(int n) 
  {
  int fact=1;
  if(n<0||n>12)
            throw new IllegalArgumentException("The parent path cannot be null!");
   for(int i=1;i<=n;i++)
   {
    fact=fact*i;
    
    }
    return fact;
  }
}