import java.util.*;                                   /* if(condition){  
                                                             code if condition is true  
                                                            }
                                                            else{     
                                                                code if condition is false  
                                                                 }     */
public class usingIfElse {                            
    public static void main(String[] args) {         
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers ");
        int n1 =sc.nextInt();
        int n2 =sc.nextInt();
 //if-else statement also tests the condition.
 //It executes the if block if condition is true otherwise else block is executed. 
        if(n1>n2){
            System.out.println(n1+" is Larger then "+n2);
        }
        if(n2>n1){
            System.out.println(n2 +" is Larger then "+n1);
        }
        else{
            System.out.println("BOTH THE NUMBER ARE EQUALS");
        }
        sc.close();
        
    }
}
