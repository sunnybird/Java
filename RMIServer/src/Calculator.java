/**
 * 服务接口定义
 */
import java.rmi.Remote; 
public interface Calculator extends Remote{

	int add(int a,int b) throws java.rmi.RemoteException;
	int sub(int a,int b) throws java.rmi.RemoteException;
	int div(int a,int b) throws java.rmi.RemoteException;
	int mul(int a,int b) throws java.rmi.RemoteException;
	
}
