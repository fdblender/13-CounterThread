package Counter;

import java.util.Scanner;

public class ThreadInterrupt {

	public static void main(String[] args) {
		System.out.println("Press Enter Key to stop the timer");
		// create counter thread
		Thread counter = new Thread(new Counter(4, "Counter"));
		// create new thread to print mom every 2 seconds
		Thread mom = new Thread(new Counter(2, "Mom"));
		counter.start();
		mom.start();
		Scanner keyboard = new Scanner(System.in);
		String s = "Start";
		while(s.equals("Start")) {
			s = keyboard.nextLine();
		}		
		counter.interrupt();
		mom.interrupt();
		keyboard.close();
	}

}
