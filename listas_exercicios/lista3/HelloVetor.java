import java.util.Scanner;

public class HelloVetor {

    public static void linhas() {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o número " + (i + 1) + ":");
            nums[i] = input.nextInt();
        }

        linhas();

        System.out.print("nums = [");
        for (int i = 0; i < 5; i++) {
            if (i < 4) {
                System.out.print(nums[i] + ", ");
            } else {
                System.out.print(nums[i]);
            }
        }
        System.out.println("]");
        linhas();
    }

}
