class ICICI{
    public void Ibm()
    {
        System.out.println("ADITYA KUMAR ");
    }
}
class IBM extends ICICI
{
    public void Ibm()
    {
        super.Ibm();
        System.out.println("RISHU GUPTA ");
    }
}
public class Test {
    public static void main(String args[])
    {
        IBM a= new IBM();
        a.Ibm();
    }
}
 