class halfHourGlass {
    public static void main(String[] args) {
        for(int i = 1; i <= 15; i++){
            if(i <= 8){
                for(int j = 0 + i; j <= 8; j++){
                    System.out.print("*");
                }
            }
            else if(i > 8){
                for(int r = 15 - i; r < 8; r++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
