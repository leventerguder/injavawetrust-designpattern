package nullobject;

import java.io.IOException;
import java.io.PrintWriter;

public class StorageService {

	public void save(Report report) {
		System.out.println("Writing report out");
		try(PrintWriter writer = new PrintWriter(report.getName()+".txt")) {
			
			writer.println(report.getName());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
