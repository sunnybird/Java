/**
 * ��������ʵ�岢�󶨽ӿ�
 */
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
public class Server {
	
	public  Server(){
		
		
		 try {
		       Calculator c = new CalculatorImp();
		       //ע��ͨѶ�˿�  
	            LocateRegistry.createRegistry(6600);  
	            //ע��ͨѶ·��  
	            Naming.rebind("rmi://127.0.0.1:6600/CalculatorService", c);  
	            System.out.println("Service Start!");  
	        } catch (Exception e) {  
	            // TODO Auto-generated catch block  
	            e.printStackTrace();  
	        }  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new Server(); 
	}

}
