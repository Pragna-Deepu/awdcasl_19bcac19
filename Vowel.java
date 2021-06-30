import java.util.*;
class Vowel
{
public static void main()
{
Scanner inp=new Scanner(System.in);
System.out.printLN("Enter Character: ");
char c=((inp.nextLine()).charAt(0));
char z=Character.toUpperCase(c); 

switch(z) 
{
case 'A':
case 'E':
case 'I':
case 'O':
case 'U':
System.out.println(c+" is a Vowel.");
break;

default: System.out.println(c+" is a Non-Vowel Character.");
}

}
}