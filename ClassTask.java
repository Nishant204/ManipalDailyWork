import java.util.ArrayList;

public class ClassTask{
    String name ;

    public ClassTask(String name) {
        this.name = name;
    }

    public static void main (String[]args){
     
        ClassTask t1 = new ClassTask("nishant");
       
         ArrayList<ClassTask> al = new ArrayList<ClassTask>();
         al.add(t1);
         System.out.print(al.get(0).name);

    }
}