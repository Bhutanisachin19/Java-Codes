
import java.net.*;
class Network1
{
public static void main(String args[]) throws UnknownHostException
{
InetAddress add = InetAddress.getLocalHost();
System.out.println("getLocalHost: "+ add);
add= InetAddress.getByName("www.google.com");
System.out.println(add);
}
}