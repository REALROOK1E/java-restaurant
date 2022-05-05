import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.*;

public class Order {

	 Scanner sc=new Scanner(System.in);
	int size;
    double price=0;
    static String type;
    double price1;
     double price2;
    int num=0;
	static boolean extra;

	 public  void meaty() 
	 {		  
	      type="meaty";
		   price1=11.5;
		   price2=15.5;
     }	
	 public  void Vegetarian() 
	 {		  
	      type="Vegetarian";
		   price1=9.5;
		   price2=13.5;
     }	
	 public  void Hawaiian() 
	 {		  
	      type="Hawaiian";
		   price1=10.5;
		   price2=14.5;
     }	
	
	

public int choice1() 
	 { 	 
		 System.out.print("What kind of pizza would u like？\n[M]————Meaty\n[V]————very vegetarian\n[H]————Heaping Hawaiian");
		 type=sc.next();
		switch(type) {
		case "m":
			 meaty();
			  break;
		case "M":
			  meaty();
			  break;
		case "v":
			Vegetarian() ;
			  break;
		case "V":
			Vegetarian();
			  break;
		case "H":
			 Hawaiian() ;
			  break;
		case "h":
			 Hawaiian() ;
			  break;
			
	    default: System.out.println("type it again"); return -1;
			   
		}
		  System.out.println("Your choise is:"+type);
		  return 0;
	 }


public int choice2(Order o)
{
     System.out.print("Price list for"+type+":\n12-inch:$"+price1+"\n16-inch:$"+price2);
	  
     System.out.println("\tplease enter the size u choose");
	 int s=sc.nextInt();
	 switch(s) 
	 {
		case 12:
			size=12;
			price= price1;
			  break;
		case 16:
			size=16;
			 price=price2;
			  break;
	    default:	     	       
        System.out.println("error,type it again!");
         return -2;    
	 }
	 return 0;
}
public int calculate() {
	
		
	  while(num<1||num>12){
		  System.out.println("How many pizzas would u like?(0-12)");
	 num=sc.nextInt();  
			  return -3;  };
	
	 price*=num;
	
	 System.out.println("Do u want an extra Cheezy Bread for $3？\n Enter Y or N to make decision");
	 String flag=sc.next();
	if(flag.equals("Y")||flag.equals("y")) 
	{
	 price+=3;
	 extra=true;
	}
	
    return 0;
}



public void show() throws IOException {
	
	
	  
	  //打开工具的路径及名字
	

	    
	
	
	    File f=new File("D:\\java相关\\receipt.txt");
	    f.createNewFile();
	    FileOutputStream fileOutputStream = new FileOutputStream(f);
	    PrintStream printStream = new PrintStream(fileOutputStream);
	    System.setOut(printStream);
	    sc.close();
	    
	System.out.println("Thank u "+Customer.name+",here is your shopping list\n\n\t"+num+"x  "+size+" inches"+" "+type+"pizzas ");
	if(extra)
    System.out.println("\t1 ordered Cheezy Bread\n\t");
	System.out.println("\tTOTAL:"+price);
	SimpleDateFormat ft = new SimpleDateFormat ("日期:yyy年MM月dd日hh:mm:ss");
	Date date=new Date();
	System.out.println(ft.format(date));
    String toolsPath = "\"C:\\Program Files (x86)\\Paperang\\Paperang\\Paperang.exe\"";
    Desktop.getDesktop().open(new File("D:\\java相关\\"));
    String fileName = "D:\\java相关\\receipt.txt";
    
    try {
         Process p = Runtime.getRuntime().exec(toolsPath+fileName);
        
    } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
    }
    
}

}