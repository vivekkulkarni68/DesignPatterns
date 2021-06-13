import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.TimerTask;

public class PollerThread extends TimerTask {
	Map<String, WorkerMemento> workerThreadState = new HashMap<String, WorkerMemento>();

	@Override
	public void run() {
		recover();
		File file = new File("c:\\input");
		File files[] = file.listFiles();
		for (File f : files) {
			new WorkerThread(f, workerThreadState.get(f.getName()));
		}

	}

	private void recover() {
		// deserialization
	}
}
