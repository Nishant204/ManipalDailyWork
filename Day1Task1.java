
import java.util.Scanner;

public class Day1Task1
{   
    public String name,company,addres;
    private int UserID;
    private String Position;
    protected  int age;

     void  CreateUser()
    {  
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name");
            name = sc.next();
         System.out.println("Enter Company_name");
            company = sc.next();
         System.out.println("Enter UserID");
            UserID = sc.nextInt();
         System.out.println("Enter Position");
            Position=sc.next();
         System.out.println("Enter age");
            age=sc.nextInt();
         
    }
    void Display()
    {
        System.out.println("Here Is your Emplyee Detail");
        System.out.println("................................");
        System.out.println("Name: " +name);
        System.out.println("company name : " + company);
        System.out.println("User Id : "+UserID);
        System.out.println("Position :"+Position);
        System.out.println("Age : " +age);


    }



   public static void main (String[]args) 
   {
     
    Day1Task1 User= new Day1Task1();
      User.CreateUser();
      User.Display();

   }
}
