import java.util.Scanner;
class Power{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int base;
int power;
int result=1;
System.out.println("Enter the base number");
base=sc.nextInt();
System.out.println("Enter the power number");
power=sc.nextInt();
for(int i=1;i<=power;i++)
{
result *=base;
}
System.out.print(" Result "+result);
}


}