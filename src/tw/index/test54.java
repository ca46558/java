package tw.index;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.rmi.server.ExportException;

import javax.print.DocFlavor.INPUT_STREAM;

public class test54 {

	public static void main(String[] args) {
		try (FileReader reader = new FileReader("dir1/ns1hosp.csv");
				
				BufferedReader br = new BufferedReader(reader)) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] row = line.split(",");
				System.out.printf("%s:%s\n",row[2], row[7]);
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
