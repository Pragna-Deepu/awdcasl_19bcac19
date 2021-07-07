import java.util.*;
class EveOddArr
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number:");
int n=sc.nextInt();
int i,result;
int even=0,odd=0;
int arr[]=new int[n];
for( i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
for( i=0;i<n;i++)
{
if(arr[i]%2==0)
even++;
else
odd++;
}
System.out.println("even"+even+" odd"+odd);
result=even*odd;
System.out.println("the num after mul is: "+result);
if(result%2==0)
System.out.println("the result of the num is even");
else
System.out.println("the result of the num is odd");
}
}