import java .util.*;
public class Replace
{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter the number: ");
int n =sc.nextInt();
System.out.println("Enter the x value: ");
int x =sc.nextInt();
System.out.println("Enter the y value : ");
int y =sc.nextInt();
int rev=0,rem;
while(n>0)
{
rem=n%10;
if(rem==x)
{
rem=y;
}
rev=rev*10+rem;
n=n/10;
}
System.out.println("the num is: "+rev);

}
}