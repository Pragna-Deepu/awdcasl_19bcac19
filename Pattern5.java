import java.util.*;
public class Pattern5 
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
int rows=sc.nextInt();
int k=1;
for(int i=rows;i>=1;i--)
{
for(int j=1;j<=k;j++)
{
System.out.print("* ");
}
k=k+2;
System.out.println();
System.out.println();
}
for(int i=1;i<=rows;i++)
{
for(int j=k;j<=k;k--)
{
System.out.print("* ");
}
k=k-2;
System.out.println();
System.out.println();
}
}
}