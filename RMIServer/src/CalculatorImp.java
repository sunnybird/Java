/**
 * 服务接口实现
 */
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class CalculatorImp  extends UnicastRemoteObject implements Calculator {

	protected CalculatorImp() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int add(int a, int b) throws RemoteException {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public int sub(int a, int b) throws RemoteException {
		// TODO Auto-generated method stub
	      return a - b;
	}

	@Override
	public int div(int a, int b) throws RemoteException {
		// TODO Auto-generated method stub
		return a * b;
	}

	@Override
	public int mul(int a, int b) throws RemoteException {
		// TODO Auto-generated method stub
		return a / b;
	}

}
