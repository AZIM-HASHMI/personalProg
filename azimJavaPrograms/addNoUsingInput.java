import java.util.*;
public class addNoUsingInput {//PORGRAM FOR ADDITION 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//USING SCANNER FOR TAKING INPUT FROM USER
        System.out.println("............Enter the Numbers............");
        float n1=sc.nextFloat();
        float n2=sc.nextFloat();
        float sum = n1+n2;//HERE WE CAN USE DIFFERENT OPERATOR [+,-,*,/,%,ETC]TO HAVE VARITEY OF DIFFERENT OPERATON
        System.out.println("The Sum of Numbers is: "+sum);
        sc.close();
        }
    
}
