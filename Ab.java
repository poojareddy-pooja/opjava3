import java.util.*;
class Ab

{ 
 public static void main (String args[])
 {
  Scanner sc=new Scanner(System.in);
 // int sno,tm;
 int sal,eno,b=0,t=0;
  char desig,m,c,a;
   String name;
  //String sname;
 /* System.out.println("enter the name");
  sname=sc.next();
  System.out.println("enter the sno");
  sno=sc.nextInt();
   System.out.println("enter thetotam amount");
   tm=sc.nextInt();
  if(tm<300)
    System.out.println("third");
  else if(tm>=300 && tm<360)
    System.out.println("second");
  else if(tm>360)
    System.out.println("first");*/
   /*System.out.println("enter year");
  y=sc.nextInt();
  if(y%4==0)
    if(y%100!=0)
     System.out.println("leap");
     else
     {
      if(y%400==0)
      System.out.println("leap");
     }
  else
    System.out.println("not");*/
 /* System.out.println("enter no");
  y=sc.nextInt();
  if(y>0)
    System.out.println("pos");
  else if(y<0)
    System.out.println("neg");
  else
    System.out.println("zero");*/
  System.out.println("enter name");
   name=sc.next();
  System.out.println("enter salary");
   sal=sc.nextInt();
  System.out.println("enter number");
  eno=sc.nextInt();
  System.out.println("enter designation");
  desig=sc.next().charAt(0);
 {
  if(desig=='m')
   b=(20*sal)/100;
    else if(desig=='a')
    b=(10*sal)/100;
  else if(desig=='c')
     b=(5*sal)/100;
 }
  t=b+sal;
 System.out.println("totl salary="+t);
 }
}
   																	
   

 





  






  
 
   
