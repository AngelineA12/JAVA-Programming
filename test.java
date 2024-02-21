public class test
{
private void display()
{
System.out.println(data);
}
private int data = 40;
public static void main(String args[])
{
test obj = new test();
System.out.println("Data is " + obj.data);
obj.display();
}
}