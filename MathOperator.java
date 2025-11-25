

public class MathOperator
{
    public static void main (String[] args){
        int a=10;
        int b=20;
        //Arthematic operators
         int add = a + b; // addition
         int subtract = a - b; // substraction
         int multiply = a * b; // multiply
         double divide = b / a; // divide
         float remainder = a % b; // modulus
      
         System.out.println("the sum of 2 no.="+add);
         System.out.println("the substraction of 2 no.="+subtract);
         System.out.println("the multiplication of 2 no.="+multiply);
         System.out.println("the division of 2 no.="+divide);
         System.out.println("the reminder of 2 no.="+remainder);
         
        int incr=a++;//increament
        System.out.println("increament="+incr);
        int decr=b--;//decreament
        System.out.println("decreament="+decr);
        
        //Relational Operators
        int age = 18;
        boolean isAdult = (age >= 18);
        System.out.println("Is adult: " + isAdult);
        
        //ternary operator
        int num = 7;
        String type = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(num + " is " + type);
 
 


    }
}