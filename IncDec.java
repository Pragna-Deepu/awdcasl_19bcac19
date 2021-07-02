import java.util.*;
class IncDec
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number: ");
int n=sc.nextInt();
if(n%4==0)
{
System.out.println("the num is divisible,after inc: "+(++n));
}
else
{
System.out.println("the num is not divisible,after dec "+(--n));
}
}
}
