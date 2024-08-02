// accept n employ information and display(note: accept information in main function and pass)
import java.util.*;
class emp
{
int eno;
String ename;
double sal;
void accept(int eno1,String ename1,double s)
{
eno=eno1;
ename=ename1;
sal=s;
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
System.out.println("enter emp no ename sal");
int eno=sc.nextInt();
String ename=sc.next();
double sal=sc.nextDouble();
ob[i].accept(eno,ename,sal);
ob[i].disp();
}
}
}


