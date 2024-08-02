//accept n numbers in array and display
import  java.util.*;
class Demo
{
public static void main(String arg[])
{
int a[]=new int[10];
Scanner sc=new Scanner(System.in);
System.out.println("enter limit");
int n=sc.nextInt();
System.out.println("enter n numbers");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("numbers");
for(int i=0;i<n;i++)
{
System.out.printf("%d\t",a[i]);
}
}
}