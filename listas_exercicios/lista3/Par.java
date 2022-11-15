import java.util.Scanner;

public class Par {

    public static void linhamenor() {
        System.out.println("----------");
    }

    public static void linhas() {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Informe o número " + (i + 1) + ":");
            nums[i] = input.nextInt();
        }

        linhas();
        System.out.println("Vetor completo:");
        System.out.print("[");
        for (int i = 0; i < nums.length; i++) {
            if (i < (nums.length - 1)) {
                System.out.print(nums[i] + ", ");
            } else {
                System.out.print(nums[i]);
            }
        }
        System.out.println("]");

        linhas();
        System.out.println("Números pares do vetor:");

        linhamenor();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                System.out.println(nums[i]);
            }
        }
        linhamenor();
        linhas();
    }
}
