import java.util.Scanner;
class Pali{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int x;
int n=sc.nextInt();
int temp;
temp=n;
int pali=0;
while(n!=0)
{
 x=n%10;
 n=n/10;
 pali=pali *10+x;
 }
 System.out.println(rev);
if(temp==n)
{
System.out.println("it is a Palindrom")
}

}

