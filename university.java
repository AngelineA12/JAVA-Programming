//Create a class Teacher with data members and member functions. Create a class University and call the data members and member functions of class Teacher


//Create a class named university
class university
{

//Creating the data members
String name, dept;

//Main Function
public static void main(String args[])
{

//Creating Objects
teacher o = new teacher();

//Initializing objects
o.name = "Angeline";
o.dept = "Mathematics";

//Calling the function
o.display();

}
}
class teacher
{
String name, dept;
public void display()
{
System.out.println(name+"\n"+ dept);

}
}
