class Student{
    int id;
    String Name;
    float fees;
    long mobileNo;
    int age;
    public void studentInfo(){
        System.out.println("Student ID is : " + this.id);
        System.out.println("Name of the Student is : " + this.Name);
        System.out.println("Student college Fees is : " + this.fees);
        System.out.println("Student Mobile Number is : " + this.mobileNo);
        System.out.println("The Age of Student is : " + this.age);

    }
}
public class DemonstrateClass {
    public static void main(String[] args) {
        Student s = new Student();
        s.id = 454;
        s.Name = "Azim Hahsmi";
        s.fees = 30000f;
        s.mobileNo = 8623039476L;
        s.age = 21;
        s.studentInfo();

    }
    
}
