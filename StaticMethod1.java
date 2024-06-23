@FunctionalInterface
interface MyMath {  
    
    int calculate(int a, int b);  

   
    static double squareRoot(int num) {  
        return Math.sqrt(num);  
    }  
}  

public class StaticMethod1 {  
    public static void main(String[] args) {  
       
        MyMath addition = (a, b) -> a + b;  
        
       
        int result = addition.calculate(5, 11);  
        System.out.println("Result: " + result);  
  
        
        double sqrtResult = MyMath.squareRoot(25);  
        System.out.println("Square root: " + sqrtResult);  
    }  
}
