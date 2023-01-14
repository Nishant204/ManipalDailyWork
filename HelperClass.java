import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Scanner;

public class HelperClass {
   
    HashMap<Integer, Student> Hm = new HashMap<Integer,Student>();
    Scanner sc= new Scanner(System.in);
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
   
         HelperClass H1= new HelperClass();
         boolean b=true;
         while(true)
         {
            System.out.println("\n Enter Your Choice \n 1.addStudent  \n 2.searchStudent  \n 3.deleteStudent \n 4.Exit \n");
            int choice = sc.nextInt();
            switch(choice){

                case 1: H1.StudentRecourd();
                break;
                case 2: H1.DisplayStudent();
                break;
                case 3: b=false;
                break;
                default: System.out.println("Invalid Input");
            }
        
         
         }


    }

    private void StudentRecourd() {

        System.out.println("Enter Student Name ");
        String name =sc.next();
        System.out.println("Enter Student Rollno");
        int Rollno= sc.nextInt();
        System.out.println("Enter Student college  ");
        String CollegeName= sc.next();
        System.out.println("Enter student Place ");
        String Place= sc.next();
        System.out.println("Enter student branch");
        String branch= sc.next();
       
        Student S1= new Student();
         S1.addStudent(name, Rollno, CollegeName, Place, branch);
         
        Hm.put(Rollno, S1);

    }

    public void DisplayStudent()
    {
        System.out.println("Enter your Student Roll number");
        int Rolln = sc.nextInt();
       
        for(java.util.Map.Entry<Integer, Student> entry: Hm.entrySet())  {
            
            if(entry.getKey() == Rolln) {
                Student s = entry.getValue();
                System.out.println("Name :" +s.name);
                System.out.println("College :" +s.college);
                System.out.println("Place :" +s.place);
                System.out.println("Branch :" +s.branch);
                break;
             }
             else{
                System.out.println("No student Available with that Roll no \n");
             }
        }
    }



}
