import java.util.Timer;

public class TestTimer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PollerThread poller = new PollerThread();
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(poller, 0, 10000);

	}

}
