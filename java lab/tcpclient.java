import java.net.*;
import java.io.*;

class Program{
	public static void main(String[] args) throws IOException{
		System.out.println("Client Started ");
		Socket soc = new Socket("localhost",9999);

		String data = "Shubham Sharma";

		OutputStreamWriter os = new OutputStreamWriter(soc.getOutputStream());
		os.write(data);
		os.flush();

	}
}