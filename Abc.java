import java.util.*;
class Abc
{
 public static void main (String args[])
  { 
    Scanner sc=new Scanner (System.in);
  int hr,ch=0; 
  System.out.println("enter the no of hours");
   hr=sc.nextInt();
  if(hr>0 && hr<8)
   ch=10;
  else if(hr>8 && hr<=16)
   ch=10+6*(hr-8)/8;
  else if(hr>16)
    ch=10+6*(hr-8)/8+5*(hr-16)/8;
    System.out.println("the charges is" +ch);
  }
}
