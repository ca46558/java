package tw.test.apis;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class testUtils {
	public static String loadView() throws Exception {
		String source = "C:\\Users\\User\\eclipse-workspace\\testWeb\\src\\main\\webapp\\views\\view1.html";
		File html = new File(source);
		BufferedInputStream bin = new BufferedInputStream(new FileInputStream(html));
		byte[] data = bin.readAllBytes();
		bin.close();

		return new String(data);
	}
	public static String loadView(String view) throws Exception {
		String source = String.format(
				"C:\\Users\\User\\eclipse-workspace\\testWeb\\src\\main\\webapp\\views\\%s.html", view) ;
		File html = new File(source);
		BufferedInputStream bin = new BufferedInputStream(new FileInputStream(html));
		byte[] data = bin.readAllBytes();
		bin.close();

		return new String(data);
	}
}
