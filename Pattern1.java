import java.util.*;
class Pattern1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of rows");
int rows=sc.nextInt();
for(int i=rows-1;i>=0;i--)
{
for(int j=0;j<=i;j++)
{
System.out.print("* ");
}
System.out.println();
}
}
}


