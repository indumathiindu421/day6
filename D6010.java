import java.util.Scanner;
class D6011{
public static void main(String args[]){
Scanner sc=new Scanner(System.in); 
char ch=sc.next().charAt(0);
int row=sc.nextInt();
printReversePattern(ch,row);
}
public static printReversePattern(char c,int n){
for(int i=n;i>=1;i--){
 printLine(c,i);
}

}
public static void printLine(char c,int col){
System.out.print("\n");
for(int j=1;j<=n;j++){
System.out.print(c);
}
}
}
