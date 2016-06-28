package Counter;

public class Counter implements Runnable {
	int sec;  // counter interval in milliseconds
	String str;
	
	public Counter(int sec, String str) {
		this.sec = sec;
		this.str = str;
	}

@Override
public void run() {
	Thread ct = Thread.currentThread();
	int count = 1;
	System.out.println(this.str + " Timer begins");
	
	while(true) {
		try {
			Thread.sleep(this.sec * 1000); // sleep for 1 second
		} catch (InterruptedException e) {
			break;
		}
		System.out.println(this.str + " Elapsed Time: " + count + " seconds");;
		count += sec;
	}
	System.out.println("User paused the timer");

	}
}
