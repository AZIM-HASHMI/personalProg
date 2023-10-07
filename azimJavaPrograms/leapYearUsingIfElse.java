import java.util.*;
public class leapYearUsingIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(".........ENTER THE YEAR U WANT TO CHECK.........");
        int y = sc.nextInt();
        if(((y%100==0)&&(y%400==0))||((y%100!=0)&&(y%4==0))){
            System.out.println(y+" is Leap year");

        }
        else{
            System.out.println(y +" is Not a Leap Year");
        }
     sc.close();   
    }
    
}
