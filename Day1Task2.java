
import java.util.Scanner;

public class Day1Task2
{   
    public String name,company;
    private int UserID;
    private String Position;
    protected  int age;

    public Day1Task2(String name, String company, int userID, String position, int age) {
        this.name = name;
        this.company = company;
        UserID = userID;
        Position = position;
        this.age = age;
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

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter name");
        String name = sc.next();
     System.out.println("Enter Company_name");
       String company = sc.next();
     System.out.println("Enter UserID");
       int UserID = sc.nextInt();
     System.out.println("Enter Position");
       String Position=sc.next();
     System.out.println("Enter age");
       int age=sc.nextInt();
     
    Day1Task2 User= new Day1Task2( name, company, UserID, Position,  age);
      User.Display();

   }
}
