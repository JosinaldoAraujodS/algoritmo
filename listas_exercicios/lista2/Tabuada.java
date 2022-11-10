import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;

        System.out.println("Informe o número que deseja visualizar a sua tabuada:");
        num = input.nextInt();

        for (int i = 0; i <= 10; i++){
            System.out.println(num + "x" + i + "=" + i*num);
        }
        
        input.close();
        
    }
}
