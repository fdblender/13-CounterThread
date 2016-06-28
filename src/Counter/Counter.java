package Counter;

public class Counter implements Runnable {

@Override
public void run() {
	Thread ct = Thread.currentThread();
	int count = 1;
	System.out.println("Timer begins");
	
	while(true) {
		try {
			Thread.sleep(1000); // sleep for 1 second
		} catch (InterruptedException e) {
			break;
		}
		System.out.println("Elapsed Time: " + count + " seconds");;
		count++;
	}
	System.out.println("User paused the timer");

	}
}
