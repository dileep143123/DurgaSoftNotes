import java.rmi.*;
public class CalculatorRegistry 
{
	public static void main(String[] args)throws Exception 
	{
		CalculatorRemote cr=new CalculatorRemoteImpl();
		Naming.bind("cal", cr);
		System.out.println("CalculatorRemote object is binded with 'cal' logical name in RMIRegistry");
	}
}
