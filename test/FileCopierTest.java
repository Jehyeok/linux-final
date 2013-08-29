import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import junit.framework.TestCase;

public class FileCopierTest extends TestCase {
	public void testFileCopy() throws Exception {
		File src = new File("lib/dir1");
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
	
	public void testPrintTotalPath() throws Exception {
		File src = new File("dst");
		File dstFile = new File(src.getAbsoluteFile() + "/dstFile.txt");
		
		if (dstFile.exists()) {
			System.out.println(dstFile.getAbsolutePath());
		} else {
			System.out.println("no such a file or directory");
		}
	}
}
