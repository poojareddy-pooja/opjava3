import java.util.*;
class Anycharacter
{
   public static void main (String args[])
    {
      Scanner sc=new Scanner(System.in);
       char ch;
       System.out.println("enter any character from keyboard");
        ch=sc.next()charAt(0);
         {
            if((ch=='y')||(ch=='Y'))
               System.out.println("yes");
            else
               System.out.print("no");
         }
     }
}
