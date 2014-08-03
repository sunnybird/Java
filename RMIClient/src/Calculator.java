/**
 * 方法调用接口拷贝自服务器端
 */
import java.rmi.Remote; 
public interface Calculator extends Remote{

	int add(int a,int b) throws java.rmi.RemoteException;
	int sub(int a,int b) throws java.rmi.RemoteException;
	int div(int a,int b) throws java.rmi.RemoteException;
	int mul(int a,int b) throws java.rmi.RemoteException;
	
}
