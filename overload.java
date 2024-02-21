//Creating the class overload

class overload
{
public static void main(String args[])
{
System.out.println(adder.add(1,2));
System.out.println(adder.add(1.5,1.2));
}
}
class adder
{
static int add(int a, int b)
{
return a + b;
}
static double add(double a, double b)
{
return a + b;
}
}