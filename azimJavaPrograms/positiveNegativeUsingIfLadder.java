import java.util.*;
public class positiveNegativeUsingIfLadder {//Program to check POSITIVE, NEGATIVE or ZERO:
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(".............Enter The Numbers.......");
        int n1=sc.nextInt();
        if(n1>0){
            System.out.println("GIVEN NUMBER IS POSITIVE");
        }
        else if(n1<0){
            System.out.println("GIVEN NUMBER IS NEGATIVE");
        }
        else{
            System.out.println("ZERO");
        }
        sc.close();
    }
    
}
