import java.util.*;
class ArrPrime
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number:");
int n=sc.nextInt();
int i,j,result;
int count=0,prime=0;
int arr[]=new int[n];
for( i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
for( i=0;i<n;i++)
{
for(j=2;j<=arr[i];j++)
{
if(arr[i]%j==0)
count+=count;
}
}
if(count==1)
System.out.println("num of prime nums are: "+count);
}
}