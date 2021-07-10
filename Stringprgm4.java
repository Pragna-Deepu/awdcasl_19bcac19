import java.util.*;
class Stringprgm4
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter your string");
String str=sc.next();
String temp=" ";
int i;
char ch[]=str.toCharArray();
ch=str.split(" ");
int l=ch.length();
int n=str.length();
for(i=0;i<l;i++)
{
for(i=n-1;i>=0;i--)
{
temp=temp+ch[i];
}
System.out.println(temp);
if(n==0)
{
l=temp+l;
}
System.out.println(l);
}
}
}