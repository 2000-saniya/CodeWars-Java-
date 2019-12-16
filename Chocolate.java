public class Chocolate{
  public static int breakChocolate(int n, int m) {
  int mult;
  int ans;
  mult=m*n;
  ans=mult-1;
  if(mult==0)
  {
   ans=0;
   }
    return ans;
  }
}