import java.util.*;
class Arraycon
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("size 1: ");
int n=sc.nextInt();
System.out.println("size 2: ");
int m=sc.nextInt();
int i;
int arr1[]=new int[n];
int arr2[]=new int[m];
int arr3[]=new int[n+m];
ArrayList<String> arr = new ArrayList<String>();
System.out.println("enter 1st array elements:");
for(i=0;i<n;i++)
{
arr1[i]=sc.nextInt();
}
System.out.println("enter 2nd array elements:");
for(i=0;i<m;i++)
{
arr2[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
System.out.print(arr1[i]+" ");
}
for(i=0;i<n;i++)
{
System.out.print(arr2[i]+" ");
}
for(i=0;i<n;i++)
{
arr3[i]=arr1[i];
}
for(i=n-1;i<m-1;i++)
{
arr3[i]=arr1[i];
}
for(i=0;i<(n+m)-1;i++)
{
System.out.println(arr3[i]);
}
Collections.sort(arr);
System.out.print(arr);
}
}