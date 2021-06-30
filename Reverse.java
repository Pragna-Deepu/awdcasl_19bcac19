import java.util.*;
public class Reverse
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in); 
System.out.print("Enter the value of m ");
int m= sc.nextInt(); 
System.out.print("Enter the value of n ");
int n= sc.nextInt(); 



for(int i=m;i>n;i--)
{
if(m%2==0)
System.out.print(m+" ");
m--;
}
}
}