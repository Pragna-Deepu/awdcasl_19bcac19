import java.util.*;
public class Harshad
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
int rem,add=0;
int org=n;
while(n>0)
{
rem=n%10;
add=add+rem;
n=n/10;
}
if(org%add==0)
{
System.out.println("divisible");
}
else
System.out.println(" not divisible");
}
}