public class SomaImpares {
    public static void main(String[] args) {

        System.out.println("Números ímpares entre 100 e 200...");

        for(int i = 100; i <= 200; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
