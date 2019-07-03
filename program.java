import java.util.*;
public class program{

     public static void main(String []args)
     {
         Scanner s=new Scanner(System.in);
         String str=s.nextLine();
         TreeSet<Character> str1=new TreeSet<>();
         char a[]=str.toCharArray();
         for(int i=0;i<a.length;i++)
         str1.add(a[i]);
         System.out.print(str1.size());
     }
}
