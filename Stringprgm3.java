import java.util.*;
class Stringprgm3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter string");
String str=sc.next();
String temp="";
char ch[]=str.toCharArray();
int n=str.length();
for(int i=n-1;i>=0;i--)
{
temp=temp+ch[i];
}
if(str.equals(temp))
System.out.println("palindrome");
else
System.out.println(" not a palindrome");
}

}