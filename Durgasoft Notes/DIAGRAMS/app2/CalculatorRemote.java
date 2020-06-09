import java.rmi.*;
public interface CalculatorRemote extends Remote
{
	public int add(int fval, int sval)throws RemoteException;
	public int sub(int fval, int sval)throws RemoteException;
	public int mul(int fval, int sval)throws RemoteException;
}