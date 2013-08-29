import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class FileCopier {
	public static void copyFile() throws FileNotFoundException, IOException {
		File src = new File("lib/file1.txt");
//		File src = new File("lib/dir1");
		File dst = new File("dst/file1-copy.txt");
		
		if (src.isFile()) {
			InputStream fis = new FileInputStream(src);
			OutputStream fos = new FileOutputStream(dst);
			
			int buffer = fis.read();
			
			while (-1 != buffer) {
				fos.write(buffer);
				buffer = fis.read();
			}
		} else if (src.isDirectory()) {
			System.out.println("directory cannot be copied");
		} else {
			System.out.println("no such a file or directory");
		}
	}

	public static void printTotalPath() {
		File src = new File("dst");
		File dstFile = new File(src.getAbsoluteFile() + "/dstFile.txt");
//		File dstFile = new File(src.getAbsoluteFile() + "/sub-dst-file.txt");
		
		if (dstFile.exists()) {
			System.out.println(dstFile.getAbsolutePath());
		} else {
			System.out.println("no such a file or directory");
		}
	}

	public static void main(String[] args) throws Exception {
		/*********file Copy**********/
//		copyFile();
		
		
		/*********Print Path*********/
//		printTotalPath();
		
		/*********Calculate PI/4*********/
		
//		PICalculator calculator = new PICalculator();
//		
//		Thread[] calculators = new Thread[PICalculator.THREAD_NUM];
//		
//		for (int i = 0; i < PICalculator.THREAD_NUM; i++) {
//			calculators[i] = new Thread(calculator);
//			calculators[i].start();
//		}
//		
//		for (Thread thread : calculators) {
//			thread.join();
//		}
//		
//		System.out.println(calculator.getPI());
	}
}
