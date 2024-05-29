import java.util.*;
class ThreadPriorityExample extends Thread
{
public void run()
{
System.out.println("Inside the run() method");
}
}
class ThreadPriority
{
public static void main(String args[])
{
ThreadPriorityExample t1=new ThreadPriorityExample();
ThreadPriorityExample t2=new ThreadPriorityExample();
ThreadPriorityExample t3=new ThreadPriorityExample();
System.out.println("Priority of thread t1 is: " +t1.getPriority());
System.out.println("Priority of thread t2 is: " +t2.getPriority());
System.out.println("Priority of thread t3 is: " +t3.getPriority());
t1.setPriority(6);
t2.setPriority(3);
t3.setPriority(9);
System.out.println("Priority of thread t1 is: " +t1.getPriority());
System.out.println("Priority of thread t2 is: " +t2.getPriority());
System.out.println("Priority of thread t3 is: " +t3.getPriority());
System.out.println("Currently executed the thread" +Thread.currentThread().getPriority());
Thread.currentThread().setPriority(10);
System.out.println("Currently executed the thread" +Thread.currentThread().getPriority());
}
}
