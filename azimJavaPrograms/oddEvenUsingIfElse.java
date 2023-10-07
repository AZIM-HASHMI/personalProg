 import java.util.*;
 public class oddEvenUsingIfElse {//A Java Program to demonstrate the use of if-else statement.  
                                       //It is a program of odd and even number.  
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("............Enter the Number.........");  
      int n1 =sc.nextInt();
      if(n1%2==0){
        System.out.println("The Given Number is EVEN");
      }
      else {
        System.out.println("The Given Number is ODD");
      }
      sc.close();
    }
}
