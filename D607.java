import java.util.Scanner;
class D608
{
public static void print_multiple_stars(int i)
{
for(int k=1;k<=i;k++)
 System.out.print("*");
}
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 int j=sc.nextInt();
 print_multiple_stars(j);
}
}