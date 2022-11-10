import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max = 0, min = 0, idd = 0;
        
        for (int i = 1; i <= 12; i++){

            System.out.println("Informe a idade " + i + ":");
            idd = input.nextInt();

            if (i == 1){
                max = idd;
                min = idd;
            }
            else{
                if (idd > max){
                    max = idd;
                }
                else if(idd < min){
                    min = idd;
                }
            }
        }

        System.out.println("Dentre as idades informadas, a maior é " + max + " e a menor é " + min + ".");

        input.close();
    }
}
