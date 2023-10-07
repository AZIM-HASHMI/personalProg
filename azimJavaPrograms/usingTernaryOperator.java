import java.util.*;
public class usingTernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("..........ENTER THE NUMBERS............");
        int num=sc.nextInt();
         //Using ternary operator  
        String output=(num%2==0)?num+" is EVEN":num+" is ODD";
        System.out.println(output);
    }
}   /*We can also use ternary operator (? :) to perform the task of if...else statement
 It is a shorthand way to check the condition.If the condition is true, the result of ? is returned. 
 But, if the condition is false, the result of : is returned.  */
