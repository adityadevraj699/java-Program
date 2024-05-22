abstract class Car
{
public abstract void fly();
public abstract void Drive();
public void playMusic()
{
System.out.println("Play Music");
}
}
abstract class Swift extends Car
{
public void Drive()
{
System.out.println("Driving");
}
}
class AutoSwift extends Swift
{
public void fly()
{
System.out.println("Flying");
}
}

class AbstractDemo
{
public static void main(String []args)
{
Car obj=new AutoSwift();
obj.Drive();
obj.playMusic();
obj.fly();
}
}