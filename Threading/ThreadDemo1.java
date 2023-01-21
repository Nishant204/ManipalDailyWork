package Threading;

public class ThreadDemo1 {
    
    public static void main (String[]args){

         DemoInterface1 d1 = new DemoInterface1();
         DemoInterface2 d2 = new DemoInterface2();
         DemoInteface3 d3 = new DemoInteface3();
         DemoInterface4 d4 = new DemoInterface4();
         
     d1.start();
     d2.start();
     d3.start();
     d4.start();

    }
}
