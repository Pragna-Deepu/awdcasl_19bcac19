class Arraylist
{
void add_to_ArrayList(ArrayList<Integer> A, int x)
{
A.add(x);
}	
void sort_ArrayList_Asc(ArrayList<Integer> A)
{
Collections.sort(A);
}
void reverse_ArrayList(ArrayList<Integer> A)
{
Collections.reverse(A);
}
int size_Of_ArrayList(ArrayList<Integer> A)
{
return A.size();
}
  System.out.println("Hello there");
void sort_ArrayList_Desc(ArrayList<Integer> A)
{
Collections.sort(A,Collections.reverseOrder());
}
void print_ArrayList(ArrayList<Integer> A)
{
for(Integer x:A)
{
System.out.println(x+" ");
}
}
}
