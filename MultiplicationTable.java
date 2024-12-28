
class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("MULTIPLICATION TABLE");
        
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++){
                int multiply = i * j;
                System.out.printf("| %4d |", multiply);
            }
            System.out.println();
        }
    }
}
