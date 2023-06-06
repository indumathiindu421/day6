class Student1{
int rollno;
String name;
Student(){rollno=0;name=null;}
Student(int r,String n)
rollno=r;
name=n;
}
void displayinformation()
{
System.out.println(rollno+" "+name);
}
}
class TestStudent4{
public static void main(String args[]){
Student s1;
Student s2=new Student(111,"Pawan");
s1.displayinformation();
s2.displayinformation();
}
}

