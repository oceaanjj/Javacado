
class leftTriangle {
    public static void main(String[] args) {
        
        int size = 5;
        
        for(int i = 0; i < size; i++){
            for(int j = 1; j <= size; j++){
                
               if(j < size - i){
                   System.out.print("_");
                   continue;
               }
               else{
                   System.out.print("*");
               }
            }
            System.out.println();
        }
    }
}
