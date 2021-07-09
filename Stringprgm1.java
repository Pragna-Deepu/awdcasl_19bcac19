import java.util.*;
class Stringprgm1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter string: ");
String str=sc.next();
int d=0,s=0;
char l=0,u=0;
char ch[]=str.toCharArray();
for(int i=0;i<ch.length;i++)
{
if(Character.isUpperCase(ch[i]))
u++;
else 
if(Character.isLowerCase(ch[i]))
l++;
else
if(Character.isDigit(ch[i]))
d++;
else
s++;

}
if(l==u && d==s)
System.out.println("yes");
else
System.out.println("no");
}
}
