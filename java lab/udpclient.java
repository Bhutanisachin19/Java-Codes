import java.net.*;
import java.io.*;

class Program{
	public static void main(String[] args) throws Exception{
		
		DatagramSocket soc = new DatagramSocket();
		byte[] data = new byte[10];
		data = "4".getBytes();
		InetAddress add = InetAddress.getLocalHost();
		DatagramPacket packet = new DatagramPacket(data, data.length, add ,9999);
		soc.send(packet);
		byte[] data1 = new byte[10];
		DatagramPacket packet1 = new DatagramPacket(data1, data1.length);
		soc.receive(packet1);
		String str = new String(packet1.getData());
		System.out.println(str);

	}
}