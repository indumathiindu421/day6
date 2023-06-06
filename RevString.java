import java.util.Scanner;
class RevString{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String a=sc.next();
String b=" ";
int len=a.length()-1;
String temp=
for(int i=len;i>=0;i--)
{
 b=b+a.charAt(i);
}
System.out.print(b);
}
}
