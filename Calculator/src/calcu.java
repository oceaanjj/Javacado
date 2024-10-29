class calculator{
    int num1;
    int num2;
    int choice;
    int sum;
    int sub;
    int mult;
    int divi;
    int result;
    //int user;

    void menu(){
        System.out.println();
        System.out.println("CHOOSE OPERATION ");
        System.out.println("[1] Addition");
        System.out.println("[2] Subtraction");
        System.out.println("[3] Multiplication");
        System.out.println("[4] Division");
        System.out.println("[5] CLEAR");
        System.out.print("Enter your choice (1 - 4): ");
    }
}

class Addition extends calculator{

    void add(int num1,int num2){
        sum = num1 + num2;
        System.out.println("ANSWER : "  +  num1 + " + " + num2 + " = " +  sum);
    }

	public int getsum() {
		return sum;
	}
    
}

class Subtraction extends calculator{
    void Subtraction(int num1, int num2){
        sub = num1 - num2;
        System.out.println("ANSWER : "  +  num1 + " - " + num2 + " = " + sub);
    }
    int getsub() {
    	return sub;
    }
    
}

class Multiplication extends calculator{
    void Multiplication(int num1, int num2){
        mult = num1 * num2;
        System.out.println("ANSWER : "  + num1 + " * " + num2 + " = " + mult);
    }
    int getmult() {
    	return mult;
    }
}

class Division extends calculator{
    void division(int num1, int num2){
        divi = num1 / num2;
        System.out.println("ANSWER : "  + num1 + " / " + num2 + " = " + divi);
    }    
    
    int getdiv() {
    	return divi;
    }
}

class oper extends calculator{
	void operation(int choice, int num1, int num2) {
		
		switch(choice) {
        case 1:
        	Addition a = new Addition();
            a.add(num1, num2);
            result = a.getsum();
            
            break;
        case 2:
        	Subtraction su = new Subtraction();
            su.Subtraction(num1, num2);
            result = su.getsub();
            
            break;        
        case 3:
        	Multiplication m = new Multiplication();
            m.Multiplication(num1, num2);
            result = m.getmult();
            break;
        case 4:
        	Division d = new Division();
            try{
            	
                d.division(num1, num2);
                result = d.getdiv();
            }
            catch(ArithmeticException e){
                System.out.println("Cannot divide by zero");
            }
            break;
       }
	}
	
	int getresult() {
		return result;
	}
	
}