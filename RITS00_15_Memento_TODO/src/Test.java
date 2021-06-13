import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;

public class Test {

	/**
	 * @param args
	 * @throws ClassNotFoundException
	 * @throws IOException
	 */
	public static void main(String[] args) throws ClassNotFoundException,
			IOException {
		File f = new File("c:\\input\\A.txt");
		WorkerMemento memento = null;
		RandomAccessFile raf = null;
		try {
			raf = new RandomAccessFile(f, "r");
			memento = retrieveState();
		} catch (IOException ioex) {
			memento = new WorkerMemento();
		}
		if (memento == null) {
			memento = new WorkerMemento();
		}
		long filePointer = memento.lineNumber;
		raf.seek(filePointer);
		String line = null;
		int i = 0;
		while ((line = raf.readLine()) != null) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("lien no " + (i++) + " " + line);
			long fp = raf.getFilePointer();
			memento.lineNumber = fp;
			saveMemento(memento);
		}

	}

	private static void saveMemento(WorkerMemento memento) throws IOException {
		FileOutputStream fos = new FileOutputStream("memento.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(memento);
		oos.close();

	}

	private static WorkerMemento retrieveState() throws IOException,
			ClassNotFoundException {
		FileInputStream fis = new FileInputStream("memento.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		WorkerMemento memento = (WorkerMemento) ois.readObject();

		ois.close();
		return memento;
	}

}
