 //Program to demonstrate Inheritance Concept
 class Employee {               //SUPER CLASS OR BASE CLASS
    float salary = 450000;
    int bonus = 30000;
    void salary()
     {
        System.out.println(" Programmer Salary is " + salary);
    }
}
class Programmer extends Employee {   //DERIVED CLASS OR SUB CLASS
// Programmer class inherits from Employee class
    void bonus()
     {
        System.out.println("Programmer Bonus is " + bonus);
    }
}

public class Demonstrate_Inheritance 
{
    public static void main(String args[]) 
    {
        Programmer p = new Programmer();
        p.salary(); // calls method of super class
        p.bonus(); // calls method of sub class
    }
}

