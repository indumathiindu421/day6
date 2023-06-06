import java.util.Scanner;
class D6011{
public static void main(String args[]){
Scanner sc=new Scanner(System.in); 
char c=sc.next().charAt(0);
int row=sc.nextInt();
int x,y;
if(row%2==0)
 {
   x=row/2;
   y=row/2;
   printPattern(c,x);
   printReversePattern(c,y);
}
}
public static void printReversePattern(char c,int n){
for(int i=n;i>=1;i--){
 printLine(c,i);
}
}
public static void printLine(char c,int col){
System.out.print("\n");
for(int j=1;j<=col;j++){
System.out.print(c);
}
}
public static void printPattern(char c,int n){
for(int i=1;i<=n;i++){
  printLine(c,i);
}
}
}