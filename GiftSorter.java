import java.util.Arrays; 
public class GiftSorter{
  public String sortGiftCode(String code){
  char tempArray[] = code.toCharArray(); 
   Arrays.sort(tempArray);
   return new String(tempArray);

  }
}