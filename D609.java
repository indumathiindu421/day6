import java.util.Scanner;
class D609
{
public static void print_multiple_stars(int i,char c)
{
for(int k=1;k<=i;k++)
 System.out.print(c);
}
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 int j=sc.nextInt();
 char c=sc.next().charAt(0);
 print_multiple_stars(j,'*');
  print_multiple_stars(j+1,'+');
  print_multiple_stars(j-1,'-');

 System.out.print("");
}
}
