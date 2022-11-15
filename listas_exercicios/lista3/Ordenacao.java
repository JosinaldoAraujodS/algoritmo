import java.util.Arrays;
import java.util.Scanner;

public class Ordenacao {

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
        System.out.println("Vetor nas posições originais:");
        System.out.print("nums = [");
        for (int i = 0; i < nums.length; i++) {
            if (i < (nums.length - 1)) {
                System.out.print(nums[i] + ", ");
            } else {
                System.out.print(nums[i]);
            }
        }
        System.out.println("]");

        Arrays.sort(nums); // ordenando o vetor

        linhas();
        System.out.println("Vetor ordenado de forma crescente:");

        System.out.print("nums = [");
        for (int i = 0; i < nums.length; i++) {
            if (i < (nums.length - 1)) {
                System.out.print(nums[i] + ", ");
            } else {
                System.out.print(nums[i]);
            }
        }
        System.out.println("]");

        linhas();
        System.out.println("Vetor ordenado de forma decrescente:");

        System.out.print("nums = [");
        for (int i = (nums.length - 1); i >= 0; i--) {
            if (i > 0) {
                System.out.print(nums[i] + ", ");
            } else {
                System.out.print(nums[i]);
            }
        }
        System.out.println("]");
        linhas();
    }
}
