@FunctionalInterface
    interface Sayble
    {
    void say (String msg);
    default void sayBye()
    {
    System.out.println("Bye");
    }
    }
    class FunctionalInterface12 implements Sayble
    {
    public void say(String msg)
    {
    System.out.println(msg);
    }
    }
    public class FunctionalInterface1 
    {
    public static void main(String args[])
    {
    FunctionalInterface12 obj=new FunctionalInterface12();
    obj.say("Hello How are you");
    obj.sayBye();
    }
    }
    
    
