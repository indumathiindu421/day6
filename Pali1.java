import java.util.Scanner;
class Pali1{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int x;
int n=sc.nextInt();
int a;
int poli=0;
for(int i=100;i<=n ;i++)
{
 x=i;
 while(x>0)
{
 a=x%10;
 x=x/10;
 poli=poli*10+a;
 if(i==poli)
{
 System.out.print(poli+" ");
}
poli=0;
}
}
}
}