import java.util.*;
class HelloIndia implements Runnable {
     private Thread th;
     public HelloIndia(String name) {
	th = new Thread(this,name);
	th.start();
	 }
	public void run() {
		try {
			for(int i = 1; i<=1; i++) {
				System.out.println(th.getName()+":"+i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException ex) {
			System.out.println(th.getName()+"Interrupted");
		}
		System.out.println(th.getName() +" Finished");
	}

}
public class Main{
    public static void main (String[] args) {


HelloIndia m1 = new HelloIndia("Hello India 1");
HelloIndia m2 = new HelloIndia("Hello India 2");
HelloIndia m3 = new HelloIndia("Hello India 3");
HelloIndia m4 = new HelloIndia("Hello India 4");
HelloIndia m5 = new HelloIndia("Hello India 5");
    }
}
