import java.util.*;
class Diagonal
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number of rows ");
int r=sc.nextInt();
System.out.println("enter number of cols ");
int c=sc.nextInt();
int i,j;
int arr[][]=new int[r][c];
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
arr[i][j]=sc.nextInt();
}
}

for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.print(" "+arr[i][j]);
}
System.out.println();
}
if(r==c)
System.out.println(" diagonal matrix");
else
System.out.println(" not a diagonal matrix");
}
}
