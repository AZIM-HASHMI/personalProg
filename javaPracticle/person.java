//PROGRAM TO DEMONSTRATE CLASS CONCEPT
public class person {// declaring  a class
    //Creating Data Members of Class
    static String name = "john";
    static int age = 25;
    //Creating Methods of Class
    void disp(){
        System.out.println("Invoking Method");
        System.out.println("The Name of Person is : "+name);
        System.out.println("The Age of Person is : "+age);
    }
    public static void main(String[] args) {
        person obj = new person();
        obj.disp();
    }

    
}
