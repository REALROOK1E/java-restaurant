
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
	 * 本程序秉着越界从宽，异型从严的原则，给用户足够多的机会
	 * 面向对象思想并不是很明显，其实可以把菜单中的内容放到容器里通过用户行为进行哈希查找，但是就三个菜没必要了
	 */

  
	
	
	
	
	
}
	}


