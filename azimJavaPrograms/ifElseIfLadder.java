import java.util.*;
public class ifElseIfLadder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Student Obtain Marks");
        int marks = sc.nextInt();
        if (marks<50){
            System.out.println("Fail");
        }
        else if (((marks>55)&&(marks<65))){
            System.out.println("D GRADE");
        }
        else if((marks>65)&&(marks<75)){
            System.out.println("C GRADE");
        }
        else if ((marks>75)&&(marks<85)){
            System.out.println("B GRADE");
        }
        else if((marks>85)&&(marks<95)){
            System.out.println("A GRADE");
        }
        else if ((marks>95)&&(marks<100)){
            System.out.println("A+ GRADE");
        }
        else {
            System.out.println("!!!!!INVALD!!!!!!!!!!!");
        }


    }
    
}
