import java.util.*;
class Pattern3
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("enter num of rows");
int rows = sc.nextInt();
char alpha = 'A'; 
for(int i= 0;i<=rows-1;i++)
{
for(int j=0;j<=i;j++)
{
System.out.print(alpha++);
}
System.out.println();
}
}
}