import java.util.*;
public class calc{  //USING SWITCH STATEMENT FOR DOING VARIOUS OPERATION / CALCULATOR
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("..............Enter the operation you want to perfrom..........");
        char op = sc.next().charAt(0);
        switch(op){
            case '+':System.out.println(num1+num2);
            break;
            case '-':System.out.println(num1-num2);
            break;
            case '*':System.out.println(num1*num2);
            break;
            case '/':System.out.println(num1/num2);
            break;
            case '%':System.out.println(num1%num2);
            break;
            default :System.out.println("Invalid Operation!!!");
            sc.close();
        }
    }
}