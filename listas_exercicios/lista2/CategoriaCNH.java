import java.util.Scanner;
public class CategoriaCNH {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rodas;
        float peso;
        int pessoas;
        String cnh = "";

        System.out.println("=-=-=-=-=-= CATEGORIA DA CNH =-=-=-=-=-=-=");
        System.out.println("Informe as características do veículo para descobrir a categoria da CNH...");
        System.out.println("Quantas rodas o veículo possui?");
        rodas = input.nextInt();
        System.out.println("Qual o peso do veículo?");
        peso = input.nextFloat();
        System.out.println("Quantas pessoas o veículo comporta?");
        pessoas = input.nextInt();

        if (rodas <=3){
            cnh = "A";
        }
        else if(rodas == 4 && peso <= 3500){
            cnh = "B";
        }
        else if(rodas >= 4){
            if(peso >= 3500 && peso <= 6000){
                cnh = "C";
            }
            else if(pessoas > 8){
                cnh = "D";
            }
            else if(peso > 6000){
                cnh = "E";
            }
        }
        if (cnh == ""){
            System.out.println("As informações não correspondem a nenhuma categoria, verifique se os dados estão corretos!");
        }
        else{
            System.out.println("Para dirigir um veículo com essas características, vc precisa de uma habilitação na categoria " + cnh);
        }

        input.close();

    }
    
}