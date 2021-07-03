import java.util.*;
public class Automorphic
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enet a number: ");
int n=sc.nextInt();
int pro;
pro=n*n;
System.out.println("result is "+pro);
if(pro%100==n)
{
System.out.println("the num is automorphic ");
}
else
{
System.out.println("the num is not automorphic ");
}
}
}