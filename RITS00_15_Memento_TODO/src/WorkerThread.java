import java.io.File;

public class WorkerThread extends Thread {
	File f;
	WorkerMemento memento;

	WorkerThread(File f, WorkerMemento memento) {
		this.f = f;
		this.memento = memento;
		start();
	}

	public void run() {
		// TO DO get last save line no.
		// set filepointer to lineno+1;
		// TO DO print 10 lines and save filename and
		// current line number to the Memento and persist memento;

	}

}
