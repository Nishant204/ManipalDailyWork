
import java.util.Scanner;

public class Day1Task3
{   
    public String name,company;
    private int UserID;
    private String Position;
    protected  int age;
 // constructor Overloaded here
    public Day1Task3(String name, String company, int UserID, String Position, int age) {
        this.name = name;
        this.company = company;
        this.UserID = UserID;
        this.Position = Position;
        this.age = age;
    }
    Day1Task3(String name,int UserID)
    {
        this.name= name;
        this.UserID=UserID;
    }
    Day1Task3()
    {

    }


    //Methods to Display Details 

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
     
    Day1Task3 User1= new Day1Task3( name, company, UserID, Position,  age);
    Day1Task3 User2= new Day1Task3( name, UserID);
    Day1Task3 User3= new Day1Task3( );
      User1.Display();    //here user will display all parameter as it is passed . 
      User2.Display();    // here only two parameter will be displayed because of two parameter has been passed during object creation Rest will be Null  and 0.
      User3.Display();    // no parameter passed during object Creation  so every details will be NULL and 0.

   }
}
