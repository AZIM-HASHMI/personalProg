import java.util.*;
public class nestedIFprogram {//The nested if statement represents the if block within another if block.
                //Here, the inner if block condition executes only when outer if block condition is true.
    public static void main(String[] args) {               //SYXTAX==             //if (conditon){
        Scanner sc=new Scanner(System.in);                                          //code to be executed    
        System.out.println("Enter the Age of Person");                           //if(condition){  
        int age=sc.nextInt();                                                    //code to be executed }    
        System.out.println("Enter the Weight of Person");                                     //      }
        int weight=sc.nextInt();
        if (age>20){                                              
            if(weight>60){
                System.out.println("YOU R ELIGIBLE TO DONATE BLOOD");  
            }
        }
    } 
         
                                                                                                      
                                                                                                     
}
