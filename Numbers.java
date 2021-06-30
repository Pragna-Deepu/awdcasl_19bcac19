import java.util.*;
public class Numbers
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number: ");
int n=sc.nextInt();
int rem=0;
int even=0,odd=0;
while(n>0)
{
rem=n%10;
if(rem%2==0)
{
even=even*10+rem;
}
if(rem%2!=0)
{
odd=odd*10+rem;
}
n=n/10;
}
System.out.println("even: "+even+"  odd: "+odd);
}
}