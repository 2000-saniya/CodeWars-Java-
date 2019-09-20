public class BitCounting {

	public static int countBits(int n){
    int[] barray=new int[32];
    int i=0,c=0;
   
    while(n>0)
    {
     barray[i]=n%2;
     n=n/2;
     i++;
	  }
    int b=barray.length;

    for(i=0;i<b;i++)
  {
   if(barray[i]==1)
    {
     c=c+1;
    
    }	
  }
   return c;
 }
}
 
