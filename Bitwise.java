import java.util.*;
class Bitwise
{
    public static void main(String[] args)
    {
       Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number- ");
         int n= sc.nextInt();
         if ((n | 1) > n)
            System.out.println("even");
        else
             System.out.println("odd");

            
    
 
    }
}