//Create java program with one static program and one display method and in the display program, display name, reg no and the course

class java1
{

//Declaring the data type of the data members

String Name,course;
int RegNo;

//Main function
public static void main(String args[])
{

//Declaring the data type of the data members
String name;
name = "Angeline";
//calling static function
display1(name);

//Creating objects
java1 obj = new java1();

obj.Name = "Angeline";
obj.course = "Mathematics";
obj.RegNo = 18;

//Calling non-static function
obj.display2();

}
static void display1(String name)
{
System.out.println("Name: " + name);
}
void display2()
{
System.out.println("Name: " + Name);
System.out.println("Course: " + course);
System.out.println("RegNo: " + RegNo);
}
}