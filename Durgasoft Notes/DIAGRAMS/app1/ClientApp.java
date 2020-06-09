import java.rmi.*;
public class ClientApp 
{
	public static void main(String[] args)throws Exception 
	{
		HelloRemote hr=(HelloRemote)Naming.lookup("hello");
		String msg=hr.sayHello("Durga");
		System.out.println(msg);
	}
}
