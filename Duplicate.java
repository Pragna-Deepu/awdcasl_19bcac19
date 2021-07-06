import java.util.*;
class Duplicate
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println(" enter the number: ");
int n=sc.nextInt();

int i,j;
int arr[]=new int[n];
for( i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(arr[i]==arr[j])
System.out.println("duplicate num: "+arr[i]);
}
}
}
}