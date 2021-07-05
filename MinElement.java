import java.util.*;
class MinElement
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println(" enter the number: ");
int n=sc.nextInt();

int i;
int arr[]=new int[n];
for( i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
int min=arr[0];
for( i=0;i<n;i++)
{
if(min>arr[i])
min=arr[i];
else
{
arr[i]++;
}

}
System.out.println("min elemnt is "+min);
}
}