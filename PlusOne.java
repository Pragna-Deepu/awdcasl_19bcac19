import java.util.*;
class PlusOne
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println(" enter the number: ");
int n=sc.nextInt();
int arr[]=new int[n];
int i;
for( i=0;i<=n-1;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("array before increment");
for( i=0;i<n;i++)
{
System.out.print(" "+arr[i]);
}
arr[n-1]=arr[i+1];
inr arr[org]=arr[n-1];
if(arr[org]>0)
arr[i]=0;
System.out.println("array after increment");
for( i=0;i<n;i++)
{
System.out.print(" "+arr[i]);
}

}
}
