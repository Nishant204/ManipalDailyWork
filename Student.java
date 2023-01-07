import java.util.Scanner;
class College{
    
   public String CollegeName;
   private int CollegeId;
   public String CollegeAd;

   public College(String collegeName, int collegeId, String collegeAd) 
   {
    CollegeName = collegeName;
    CollegeId = collegeId;
    CollegeAd = collegeAd;
   } 

  void DisplayCollege()
  {
    System.out.println("Here is Your College Detail");
    System.out.println(".........................................");
    System.out.println("College Name : "+CollegeName);
    System.out.println("College Id : " +CollegeId);
    System.out.println("College Adress : "+CollegeAd);
  }
}

class Branch extends College
{
   
    public String BranchName;
    private int BranchId;
    private int BranchStaffNo;
    
    public Branch(String collegeName, int collegeId, String collegeAd, String branchName, int branchId , int branchStaffNo) {
        super(collegeName, collegeId, collegeAd);
        BranchName = branchName;
        BranchId = branchId;
        BranchStaffNo = branchStaffNo;
    }

    public Branch(String collegeName, int collegeId, String collegeAd, String branchName) {
        super(collegeName, collegeId, collegeAd);
        BranchName = branchName;
    }

    void DisplayBranch()
    {
        System.out.println("Here is your Branch Detail");
        System.out.println(".................................");
        System.out.println("Branch name : "+BranchName);
        System.out.println("Branch Id  : "+BranchId);
        System.out.println("Branch Staff Number : "+BranchStaffNo);
        System.out.println("CollegeName : "+ CollegeName);
        System.out.println("College Adress : "+CollegeAd);
    }
   
  
}
public class Student extends Branch{
    String StudentName;
    int StudentId;
    Long PhoneNo;

 
 



    public Student(String collegeName, int collegeId, String collegeAd, String branchName, String studentName, int studentId, Long phoneNo) {
        super(collegeName, collegeId, collegeAd, branchName);
        StudentName = studentName;
        StudentId = studentId;
        PhoneNo = phoneNo;
    }

    void DisplayStudent()
    {
        System.out.println("Here is Your Student Detail");
        System.out.println("......................................................");
        System.out.println("Student Name : "+StudentName);
        System.out.println("Student Id : "+StudentId);
        System.out.println("Student Phone number : " +PhoneNo);
        System.out.println("Student College name : "+CollegeName);
        System.out.println("College adress : "+ CollegeAd);
        System.out.println("Branch   :  "+ BranchName);
    
    }



    public static void main(String[]args)
    {  
         Student S1= new Student("Montfort" , 101, "Bahaga-1", "Bagaha","Nishant", 10,8434253058l);
          
        boolean b=true;
         while(b)
         {   
            Scanner sc= new Scanner(System.in);
            int choice ;
            System.out.println("Enter Your Choice to see detail");
            System.out.println("...................................");
            System.out.println("1.To see Student Detail");
            System.out.println("2. To see Branch Detail");
            System.out.println("3. To  College Details ");
            System.out.println("4.To Exit ");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1 : S1.DisplayStudent();
                break;
                case 2 :  S1.DisplayBranch();
                break;
                case 3 :  S1.DisplayCollege();
                break;
                case 4 :  b=false;
                break;
                default : System.out.println("SORRY!!  Invalid Input ");
            
            }
         } 

    }

}