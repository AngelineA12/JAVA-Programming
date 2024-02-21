public class simple
{
public static void main(String args[])
{
person p = new person();
p.set("Angeline");
System.out.println("Name: " + p.get());
}
}
class person{
private String name;
public String get()
{
return name;
}
public void set(String name)
{
this.name = name;
}
}