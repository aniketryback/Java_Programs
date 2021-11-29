
public class RepeatingCharacters {
   public static void main(String[] args) {
      String s="geeksforgeeks";
      System.out.println(helper("",s));
   }
   public static String helper(String p,String up)
   {
      if(up.isEmpty())
         return p;
      char ch=up.charAt(0);
      if(up.length()>1 && ch == up.charAt(1))
        return helper(p,up.substring(1));
      else
         return helper(p+ch,up.substring(1));
   }
}
