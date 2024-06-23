@FunctionalInterface
interface Messageable
{
Message getMessage(String Name);
}
class Message
{
Message(String name)
{
System.out.println(name);
}
}
class MethodReference1
{
public static void main (String args[])
{
Messageable b=Message::new;
b.getMessage("Amit");
}
}