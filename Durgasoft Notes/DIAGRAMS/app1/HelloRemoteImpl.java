import java.rmi.*;
import java.rmi.server.*;
public class HelloRemoteImpl extends UnicastRemoteObject implements HelloRemote 
{
	public HelloRemoteImpl()throws RemoteException
	{
	}
	public String sayHello(String name)throws RemoteException
	{
		return "Hello..."+name+"!";
	}
}
