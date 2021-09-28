import java.util.*;
class Palindrome
{
 
    public static void main(String[] args) {
      int a,b,r,s=0;
      Scanner obj = new Scanner(System.in);
      System.out.println("Enter a number to be checked");
      a=obj.nextInt();
      b=a;
      while(a>0)
      {
          r=a%10;
          a=a/10;
          s=s*10+r;
      }
      if(s==b)
      {
          System.out.println("The number is plaindrome");
      }
      else
      {
           System.out.println("The number is not plaindrome");
      }
    }
    
}