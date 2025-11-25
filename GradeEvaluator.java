import java.util.Scanner;
public class GradeEvaluator
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);//creating the object of the scanner class
        //taking input from user
        System.out.println("Enter your grade:\t");
        double grade = sc.nextDouble();
        //ternary operator
        String result=(grade>=40)?"pass":"fail";
        //output using escape sequence
        System.out.println("Your Result is:\n"+result);
    }
}