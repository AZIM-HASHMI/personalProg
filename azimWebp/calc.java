import java.util.*;
public class calc{
    static int num1;
     static int num2;
    static char operator;
    public static void main(String[]aargs){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers");
        num1=sc.nextInt();
        num2=sc.nextInt();
        System.out.println("Enter the operation You Want to perfrom");
        switch(operator){
            case '+': System.out.println("num1+num");
            case '-': System.out.println(num1-num2);
            case '*': System.out.println(num1*num2);
            case '/': System.out.println(num1/num2);
            case '%': System.out.println(num1%num2);
            default : System.out.println("Invalid choice");

        }
        sc.close();




    }
}