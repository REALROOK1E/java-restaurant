
import java.io.IOException;
import java.util.InputMismatchException;

public class Pizza {
 
	

	
	
	
	

public static void main(String[] args) throws IOException {

	Customer cus=new Customer();
	
    cus.hello();
    Order order=new Order();
  
    
    
    
    
    
    try {
    	
    	while(order.choice1()!=0); 
    	while(order.choice2(order)!=0);
    	while(order.calculate()!=0);
    	      order.show();
    	      
    	      
    	}
   catch(InputMismatchException e) {
		System.out.println("--------wrong instruction,you will pay for that--------");
   }

	/*
	 * ���������Խ��ӿ����ʹ��ϵ�ԭ�򣬸��û��㹻��Ļ���
	 * �������˼�벢���Ǻ����ԣ���ʵ���԰Ѳ˵��е����ݷŵ�������ͨ���û���Ϊ���й�ϣ���ң����Ǿ�������û��Ҫ��
	 */

  
	
	
	
	
	
}
	}


