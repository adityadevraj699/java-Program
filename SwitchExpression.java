public class SwitchExpression 
    
{    
public static void main(String[] args) 
{    
String day="Wednesday";
String result="";
result=switch(day)
{
case "Saturday", "Sunday": yield "9am";
case "Monday": yield "6am";
default: yield "7am";
};
System.out.println(result);
}

}
