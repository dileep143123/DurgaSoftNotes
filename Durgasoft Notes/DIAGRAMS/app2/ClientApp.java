import java.rmi.*;
public class ClientApp 
{
	public static void main(String[] args)throws Exception 
	{
		CalculatorRemote cr=(CalculatorRemote)Naming.lookup("cal");
		System.out.println("ADD   :"+cr.add(10,5));
		System.out.println("SUB   :"+cr.sub(10,5));
		System.out.println("MUL   :"+cr.mul(10,5));
	}
}
