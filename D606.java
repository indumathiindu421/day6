import java.util.Scanner;
class D606{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int small;
if((a<b)&&(a<c))
{ 
 small=a;
 System.out.print(" Smaller is"+a);
}
else if(b<c)
 System.out.print("Smaller number is"+b);
else
 System.out.print("Smaller number is"+c);
}
}