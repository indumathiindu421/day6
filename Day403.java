import java.util.Scanner;
class Day403{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
char c=sc.next().charAt(0);
int count=0;
for(int i=0;i<=str.length()-1;i++)
{
if(str.charAt(i)==c)
{
count++;
}
}
System.out.println(count);
}
}
