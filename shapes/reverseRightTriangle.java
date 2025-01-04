class reverseRightTriangle {
    public static void main(String[] args) {
        
        int size = 5;
        
        for(int i = 1; i <= size; i++){
            for(int j = 0; j < size; j++){
                if(j < i - 1){
                    System.out.print("_");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
