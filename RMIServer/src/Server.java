/**
 * 创建服务实体并绑定接口
 */
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
public class Server {
	
	public  Server(){
		
		
		 try {
		       Calculator c = new CalculatorImp();
		       //注册通讯端口  
	            LocateRegistry.createRegistry(6600);  
	            //注册通讯路径  
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
