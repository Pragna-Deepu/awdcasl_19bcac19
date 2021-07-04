import java.util.*;
public class Pattern4
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number: ");
int n=sc.nextInt();
char ch='A';
int start=1,end=n;
while(n!=0)
{
for(int i=start;i<=end;i++)
{
for(int j=start;j<=end;j++)
{
if(i==start || i==end || j==start || j==end)
{
System.out.print(ch);
}
System.out.println();
start++;
end--;
ch++;
}
}
}
}
}