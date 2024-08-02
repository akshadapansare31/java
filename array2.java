// accept n employ information and display
import java.util.*;
class emp
{
int eno;
String ename;
double sal;
void accept()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter emp no ename sal");
eno=sc.nextInt();
ename=sc.next();
sal=sc.nextDouble();
}
void disp()
{
System.out.println("emp no="+eno);
System.out.println("emp name="+ename);
System.out.println("emp salary="+sal);
}
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
emp ob[]=new emp[10];
System.out.println("enter limit");
int n=sc.nextInt();
for(int i=0;i<n;i++)
{
ob[i]=new emp();
ob[i].accept();
}
for(int i=0;i<n;i++)
{
ob[i].disp();
}
}
}


