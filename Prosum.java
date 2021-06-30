import java.util.*;
 public  class Prosum
{
static void sum(int add,int n,int rem)
{
while(n>0)
{
rem=n%10;
add=add+rem;
n=n/10;
}
System.out.println("sum is: "+add);

}
static void diff(int pro,int add)
{
int result;
result=(pro-add);
System.out.println("result is: "+result);
}
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
System.out.println("enter the number : ");
int n=sc.nextInt();
int rem=0,add=0;int org;
int pro=1;
sum(add,n,rem);
while(n>0)
{
rem=n%10;
pro=pro*rem;
n=n/10;
}
System.out.println("product is : "+pro);
diff(pro,add);
}

}