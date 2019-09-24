public class Kata {
    public static boolean checkForFactor(int base, int factor) {
     Boolean b1 = new Boolean("True"); 
     Boolean b2 = new Boolean("False");
    if(base%factor == 0)
    {
    return b1;
    }
    else
    {
    return b2;
    }
 }
}