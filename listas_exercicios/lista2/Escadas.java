import java.util.Scanner;

public class Escadas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nvl;
        String degrais ="";

        System.out.println("Informe a quantidade de níveis:");
        nvl = input.nextInt();
        
        for (int i = 1; i <= nvl; i++){
            degrais += "*";
            System.out.println(degrais);
        }
    }
}