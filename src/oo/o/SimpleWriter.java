package oo.o;

import java.awt.dnd.InvalidDnDOperationException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

public class SimpleWriter {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("data.txt");

			fos.write(66);
			fos.flush();
			fos.close();
		} catch (FileAlreadyExistsException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
