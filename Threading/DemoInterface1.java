package Threading;

public class DemoInterface1  extends Thread {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for(int i=0 ; i<100; i++)
        {
            System.out.println("DemoInterface1 : "+i);
        }
    }


}
