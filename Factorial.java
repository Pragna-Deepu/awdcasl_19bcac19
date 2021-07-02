import java.util.*;
class Factorial
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a num: ");
int n=sc.nextInt();
int i=1,product=1;
while(i<=n)
{
product=product*i;
i++;
}
System.out.println("the factorial of the num is: "+product);
}
}