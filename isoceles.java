// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class isoceles {
    public static void main(String[] args) {
        
        /*num % 2 + 1*/
        
        int size = (9 / 2);
        
        //System.out.println(size);
        
        
        for(int i = 0; i <= size; i++){
            for(int j = 0; j < 9; j++){
            //5
            // 3 && 7
            // 2 && 8
            // 1 && 9
            int range = size - j;
            int range2 = size + j;
            
            if(j == size){
                System.out.print("*");
            }
            
            else{
                System.out.print("_"); 
            }
            
            }
            System.out.println();
        }
    }
}
