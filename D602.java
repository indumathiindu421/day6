import java.util.Scanner;
class D602{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int poli=0,temp,x;
temp=n;
while(n!=0)
{
 x=n%10;
 n=n/10;
 poli=poli*10+x;
}
 System.out.print(poli);
if(temp==poli)
 System.out.print("the number is a polindrom");
else
 System.out.print("the number is not a polindrom");
}
}