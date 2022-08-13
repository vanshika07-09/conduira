//This program is done by extending Thread class


import java.util.*;
class Hello_All extends Thread {
     private Thread th;
     public Hello_All(String name) {
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
    catch(InterruptedException e){
      e.printStackTrace();
      
    }
    	System.out.println(th.getName() +" Finished");

}
}
public class Main{
    public static void main (String[] args) {
        
        
        Hello_All m1 = new Hello_All("Hello All 1");
        Hello_All m2 = new Hello_All("Hello All 2");
        Hello_All m3 = new Hello_All("Hello All 3");
        Hello_All m4 = new Hello_All("Hello All 4");
        Hello_All m5 = new Hello_All("Hello All 5");
    }
}


