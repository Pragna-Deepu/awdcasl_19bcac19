import java.util.*;
class Stringprgm2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter string: ");
String str;
str=sc.nextLine();
String ch[]=str.split(" ");
int n=ch.length;
int m=0;
if(n==0)
System.out.println(n);
else
{
String st=ch[n-1];
m=st.length();
count(m);
}
static void count(int m)
{
int c=c+m;
}
System.out.println(c);
}
}