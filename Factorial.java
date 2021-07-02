import java.util.*;
class Factorial
{
static void count(int n)
{
for(int k=1;k<=n;k++)
{
Scanner s=new Scanner(System.in);
int num=s.nextInt();
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a num: ");
int n=sc.nextInt();
count(n);
int i=1,product=1,num;
for(int j=1;j<=n;j++)
{
while(i<=num)
{
product=product*i;
i++;
}
System.out.println("the factorial of the num is: "+product);
}
}
}
