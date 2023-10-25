import java.util.*;
public class nestedIfPr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the AGE and WEIGHT");
        int age=sc.nextInt();
        int weight=sc.nextInt();
        if (age>18){
            if (weight>50){
                System.out.println("You are Eligible for donating blood");
            }
            else {
                System.out.println("You are not Eligible");
            }
             
        }
        else{
                System.out.println("age must be greater then 18");
            }
            sc.close();
    }
}
