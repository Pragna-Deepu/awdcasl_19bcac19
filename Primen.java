import java.util.*;
class Primen
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter two numbers: ");
int n=sc.nextInt();
int m=sc.nextInt();
int i;
int count=0;
for(i=2;i<=n|| i<=m;i++)
{
if(n%i==0|| m%i==0)
count++;
}
if(count==2)
System.out.println("prime numbers ");
else
System.out.println("enter prime numbers");
if(m-n==2||n-m==0)
System.out.println("twin prime");
else
System.out.println("not a twin prime");
}
}