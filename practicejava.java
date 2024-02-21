//Practice

class practicejava
{
public void add()
{
int Sum = n1 + n2;
System.out.println("Sum of the numbers "+  Sum);
}

public void sub()
{
int Diff = n1 - n2;
System.out.println("Difference of the numbers " +  Diff);
}

public void mult()
{
int Product = n1 * n2;
System.out.println("Sum of the numbers " + Product);
}

int n1, n2;
public static void main(String args[])
{

//Object creation for the data members
practicejava Obj = new practicejava();

//Calling the object
Obj.n1 = 97;
Obj.n2 = 387;

Obj.add();
Obj.sub();
Obj.mult();
}
}