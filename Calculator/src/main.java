import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       calculator c = new calculator();
       Addition a = new Addition();
       Subtraction su = new Subtraction();
       Division d = new Division();
       Multiplication m = new Multiplication();
       oper o = new oper();
       int choice;
       int num1 = 0, num2  = 0;
       boolean valid = false;
       int add, sub, mult, div;
       boolean clear = false;
       int clr;

       System.out.println("------- [ Welcome to Calculator Program ] -------");
       
       while(true){

                while(!valid){
                    System.out.print("Enter Number : ");
                    try{
                        num1 = s.nextInt();
                        valid = true;
                    }
                    catch(InputMismatchException e){
                        System.out.println("Invalid input, please enter a number");
                        s.next();
                    } 
                }
                  

                valid = false;
                while(!valid){
                    System.out.print("Enter Number : ");
                    try{
                        num2 = s.nextInt();
                        valid = true;
                    }
                    catch(InputMismatchException e){
                        System.out.println("Invalid input, please enter a number");
                        s.next();
                    }
                }
                	
                
                    c.menu();
                    choice = s.nextInt();
                    
                    o.operation(choice, num1, num2);
                    
                    while(!clear) {
	                    if(choice == 5) {
	                    	continue;
	                    }
	                    else {
	                    	num1 = o.getresult();
	                    	System.out.print("Enter Number : ");	                    
	                    	num2 = s.nextInt();
	                    	
	                    	c.menu();
	                        choice = s.nextInt();
	                        
	                    	
	                        if(choice == 5) {
	                        	valid = false;
	                        	break;
	                        	
	                        }
	                        else {
	                    	o.operation(choice, num1, num2);
	                        }
	                    	
	                    	
	                    }
                    }
                    
 
    
    }
    
    
}

}
