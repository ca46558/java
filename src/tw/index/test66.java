package tw.index;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.net.ssl.HttpsURLConnection;

public class test66 {

	public static void main(String[] args) {
		try {
		URL url = new URL("https://www.iii.org.tw");
		HttpsURLConnection conn = (HttpsURLConnection)url.openConnection();
	
		BufferedReader reader =
				new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String line; StringBuffer sb = new StringBuffer();
		while((line = reader.readLine()) != null) {
			sb.append(line + "\n");
		}
		reader.close();
		conn.disconnect();
		
		System.out.println(sb);
		System.out.println("Finish");
		}catch(Exception e) {
		e.printStackTrace();
		}

	}

}
