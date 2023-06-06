import java.util.Scanner;
class Pali{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int x;
int n=sc.nextInt();
int temp;
temp=n;
int poli=0;
while(n!=0)
{
 x=n%10;
 n=n/10;
 poli=poli *10+x;
 }
 System.out.println(poli);
if(temp==poli)
{
System.out.println("it is a Polindrom");
}
else
 System.out.println("not Polindrom");
}
}

