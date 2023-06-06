import java.util.Scanner;
class D4
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int max,min;
int a=sc.nextInt();
int b=sc.nextInt();
if(a>b)
 {
  System.out.println(" maximum number is"+a);
System.out.println("  minimum number is "+b);
 }
 else
{
 System.out.println(" minimum  number is"+" "+a);
System.out.println(" maximum number is"+" "+b);
}
}
}