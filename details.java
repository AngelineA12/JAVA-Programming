class details
{
public static void main(String args[])
{
teacher tt = new teacher();
tt.display();
}
}   
class employee
{
String name = "JAVA";
employee()
{
System.out.println("This is a constructor");
}
void display()
{
System.out.println("This is member function of super class");
}
}

class teacher extends employee
{
String name = "Angeline";
teacher()
{
//super();
System.out.println("This is the constructor of subclass");
}
void display()
{
System.out.println(name);
System.out.println(super.name);
super.display(); //Using super keyword how to invoke the member function
}
}    

                         