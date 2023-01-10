import java.util.Scanner;
public class Student
{

    String name;
    int age;
    String College;
    String Address;
    int c=0;
    static Student arr[];
    Scanner sc= new Scanner(System.in);

    void Add()
    { 
      if(c<arr.length)
      {
         Student std1 = new Student();
         System.out.println("Enter name :");
         std1.name=sc.next();
         System.out.println("Enter Age  :");
         std1.age=sc.nextInt();
         System.out.println("College Name  : ");
         std1.College=sc.next();
         System.out.println("College Address");
         std1.Address=sc.next();
         arr[c]=std1;
         c++;
         
      }
      else
      {
        System.out.println("Seat Full\n");
      }

    }

    void displayStudent()
    {  
        System.out.println("All the Student Details are :");

       for (Student student : arr) {
         System.out.println("\nStudent name :"+student.name);
         System.out.println("Student age : "+ student.age);
         System.out.println("Student College : "+student.College);
         System.out.println("Student address  : "+student.Address);
          
       }
    }
   



 public static void main(String[]args)
 {
    System.out.println("Enter the Size of Array Student");
    Student Std2= new Student();
    int n= Std2.sc.nextInt();
     Std2.arr = new Student[n];
    boolean b= true;
     while (b)
      {
        System.out.println("Enter Case\n 1:addStudent\n 2:Display\n 3:exit");
        int choice = Std2.sc.nextInt();
        switch (choice) 
        {
            case 1:
                Std2.Add();
                break;
            case 2:
                Std2.displayStudent();
                break;
            case 3:
                 b=false;
            default : System.out.println("Sorry!!!!  Invalid option");
        }
     }
 }
}




