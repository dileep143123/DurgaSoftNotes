import java.rmi.*; 
public class HelloRegistry 
{
	public static void main(String[] args)throws Exception 
	{
		HelloRemote hr=new HelloRemoteImpl();
		Naming.bind("hello", hr);
		System.out.println("HelloRemote object is binded with 'hello' logical name in RMIRegistry"); 
	}
}
