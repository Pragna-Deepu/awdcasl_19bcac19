import java.util.*;
public class Odd
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the n value: ");
int n=sc.nextInt();
int even=0,odd=0,rem=0;
while(n>0)
{
rem=n%10;
if(rem%2==0)
even++;
else
odd++;
}
System.out.println("even "+even);
System.out.println("odd "+odd);
}
}