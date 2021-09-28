import java.net.*;
import java.io.*;

class Program{
	public static void main(String[] args) throws Exception{
		System.out.println("Server is Started.");
		DatagramSocket soc = new DatagramSocket(9999);	

		byte[] data = new byte[256];
		DatagramPacket packet = new DatagramPacket(data, data.length);
		soc.receive(packet);
		String str = new String(packet.getData());
		int n = Integer.parseInt(str.trim());
		System.out.println(str);

		InetAddress ai = InetAddress.getLocalHost();
		data = ((n*n)+"").getBytes();
		DatagramPacket packet1 = new DatagramPacket(data, data.length, ai, packet.getPort() );
		soc.send(packet1);
	}
}