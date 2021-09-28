import java.net.*;
import java.io.*;

class Program{
	public static void main(String[] args) throws IOException{

		System.out.println("Server is Started ");
		ServerSocket ss = new ServerSocket(9999);
		Socket soc = ss.accept();
		System.out.println("User Connected Successfully.");

		BufferedReader br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
		String data = br.readLine();

		System.out.println(data);
	}
}