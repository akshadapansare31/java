//write a java program to accept details of n books& display the quantity of given book.
import java.util.*;
class book
{
int bno,qty;
String bname;
void accept()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the book bno qty bname");
bno=sc.nextInt();
qty=sc.nextInt();
bname=sc.next();
}
public static void main(String arg[])
{
book ob[]=new book[10];
Scanner sc=new Scanner(System.in);
System.out.println("enter limit");
int n=sc.nextInt();
for(int i=0;i<n;i++)
{
ob[i]=new book();
ob[i].accept();
}
System.out.println("enter name to search quantity");
String name=sc.next();
int flag=0;
for(int i=0;i<n;i++)
{
if(ob[i].bname.equals(name))
{
System.out.println("quantity="+ob[i].qty);
flag=1;
break;
}
if(flag==0)
System.out.println("book not found");
}
}
}
