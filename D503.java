import java.util.Scanner;
class D503
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int i=0;
while(i<=num)
{
System.out.print(i);
if(i<10)
{
 System.out.print(",");
}
}

}}