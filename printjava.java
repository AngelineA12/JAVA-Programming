//Class creation
class printjava
{

String name1; // The string should be declared outside the main function if we are ceating object.

//Own Method
static void display(String name)//Member function - Any function declared inside the class is called member function
{
System.out.print("\nHi"+"\t"+ name);
}

//first default method
public static void main(String args[])
{
int num1, num2; //Data members - Variables declared inside the class
num1= 45;
num2 = 55;
System.out.println(num1+"\t"+num2);
int n1;
for(n1=1; n1 < 10; n1++)
{
System.out.print(n1);
}

String name = "Angeline";
display(name);


//Object creation; Object should be created when we don't use the keywoed static
printjava obj = new printjava();// new is  a keyword to create a separate memory space for the object
//calling the object
obj.name1 = "JAVA";
System.out.println("\nName is = " +obj.name1);

obj.display(name);
}
}
