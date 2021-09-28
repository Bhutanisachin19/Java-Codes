import java.net.InetAddress;
import java.net.UnknownHostException;

class Program{
	public static void main(String[] args) throws UnknownHostException
	{
		InetAddress address = InetAddress.getLocalHost();
		System.out.println("Local host is : "+address);
	}
}