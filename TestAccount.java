class Account{
int accno;
String name;
float amount;
void insert(int a,String n,float amt){
accno=a;
name=n;
amount=amt;
}
void deposit(float amt)
{
amount=amount+amt;
System.out.println(amt+"deposited");
}
void withdraw(float amt){
if(amount<amt){
System.out.println("Insufficient Balance");
}
else{
amount=amount-amt;
System.out.println(amt+"withdrawn");
}
}
void checkBalance()
{
System.out.println("Balance is:"+amount);}
void display()
{
System.out.println(accno+" "+name+" "+amount);
}
}
class TestAccount{
public static void main(String[] args){
Account a1=new Account();
a1.insert(832345,"Indu",10000);
a1.display();
a1.checkBalance();
a1.deposit(40000);
a1.checkBalance();
a1.withdraw(15000);
a1.checkBalance();
}
}




