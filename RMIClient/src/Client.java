/**
 * 创建服务实体并绑定
 */
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		// TODO Auto-generated method stub
		Calculator calc=(Calculator)Naming.lookup("rmi://127.0.0.1:6600/CalculatorService"); 
	    System.out.println(calc.add(10, 10));
	    System.out.println(calc.sub(10, 10));
	    System.out.println(calc.div(10, 10));
	    System.out.println(calc.mul(10, 10));
	
	}

}
