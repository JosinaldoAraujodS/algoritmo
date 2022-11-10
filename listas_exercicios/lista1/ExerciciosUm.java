import java.util.Scanner;

public class ExerciciosUm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //---------------- QUESTÃO 1 ------------------------------------------------------------------------------
        /*
        String nm;
        int idd;

        System.out.println("Informe seu nome:");
        nm = input.nextLine();
        System.out.println("Informe sua idade:");
        idd = input.nextInt();

        System.out.println("Olá " + nm + ", vc tem " + idd + " anos de idade.");
        */
        //---------------- QUESTÃO 2 ------------------------------------------------------------------------------
        float n1;
        float n2;
        float resp;
        /*
        System.out.println("Informe o valor 1");
        n1 = input.nextFloat();
        System.out.println("Informe o valor 2");
        n2 = input.nextFloat();

        resp = n1 + n2;

        System.out.println(n1 + " + " + n2 + " = " + resp);
        */
        /*
        //---------------- QUESTÃO 3 ------------------------------------------------------------------------------
        System.out.println("Informe um número:");
        n1 = input.nextFloat();
        if(n1%2==0){
            System.out.println(n1 + " é par.");
        }
        else{
            System.out.println(n1 + " é ímpar.");
        }
        
        */
        /*
        //---------------- QUESTÃO 4 ------------------------------------------------------------------------------
        System.out.println("Informe o valor de A:");
        n1 = input.nextFloat();
        System.out.println("Informe o valor de B:");
        n2 = input.nextFloat();

        if(n1 > n2){
            resp = n1 + n2;
            System.out.println("A é maior que B: A + B = " + resp);
        }
        else if(n1 < n2){
            resp = n1 * n2; 
            System.out.println("A é menor que B: A * B = " + resp);   
        }
        else{
            System.out.println("A = B");
        }
        */
        /*
        //---------------- QUESTÃO 5 ------------------------------------------------------------------------------
        System.out.println("Informe um número:");
        n1 = input.nextFloat();

        if(n1 > 0){
            resp = n1*n1;
            System.out.println("O número informado foi " + n1 + " e o seu dobro é igual a " + resp);
        }
        else{
            resp = n1 * 3;
            System.out.println("O número informado foi " + n1 + " e o seu triplo é igual a " + resp);
        }
        */
        /*
        //---------------- QUESTÃO 6 ------------------------------------------------------------------------------
        int parc = 1;
        System.out.println("Informe o valor do produto:");
        n1 = input.nextFloat();
        System.out.println("Informe a forma de pagamento:");
        System.out.println("Digite 1 para: A vista, Pix, Débito, tem 10% de desconto.");
        System.out.println("Digite 2 para: Crédito a vista, preço normal.");
        System.out.println("Digite 3 para: Crédito parcelado (+juros).");
        n2 = input.nextInt();
        if(n2 == 1){
            resp = n1 - (n1 * 0.1f);
            System.out.println("Vc escolheu a opção 1 e obteve um desconto de 10%.");
            System.out.println("O valor que era R$" + n1 + " ficou R$" + resp);
        }
        else if(n2 == 2){
            System.out.println("Vc escolheu a opção 2 e vai pagar o preço normal.");
            System.out.println("Valor a pagar R$" + n1);
        }
        else if(n2 == 3){
            System.out.println("Vc escolheu a opção 3, vai querer dividir em quantas parcelas?");
            parc = input.nextInt();
            //while(true){
                if (parc <= 1){
                    resp = n1;
                    System.out.println("Valor a pagar R$" + n1);
                }else{
                    resp = n1 + (n1 * 0.1f * parc);
                    System.out.println("O valor R$" + n1 + " pago em " + parc + " parcelas, vai dar um total de R$" + resp);
                }      
        }
        */
        /*
        //---------------- QUESTÃO 7 ------------------------------------------------------------------------------
        System.out.println("Informe a primeira nota (0 a 100):");
        n1 = input.nextFloat();
        System.out.println("Informe a segunda nota (0 a 100):");
        n2 = input.nextFloat();
        System.out.println("Informe a terceira nota (0 a 100):");
        float n3 = input.nextFloat();
        
        float med = (n1 + n2 * 2 + n3 * 3)/6;
        String nt = "";
        
        if(med >= 60){
            if(med >= 90){
                nt = "A";
            }
            else if(med >= 75){
                nt = "B";
            }
            else if(med >= 60){
                nt = "C";
            }
            System.out.println("Com a média " + med + " o aluno obteve a nota " + nt + ", e está aprovado!");
        }else{
            if(med >= 40){
                nt = "C";
            }
            else{
                nt = "D";
            }
            System.out.println("Com a média " + med + " o aluno obteve a nota " + nt + ", e está reprovado!");
        }
        */
        
        //---------------- QUESTÃO 8 ------------------------------------------------------------------------------
        float temp1;
        int opcao;
        String escala1 = "";
        String escala2 = "";
        resp = 0;
        System.out.println("Informe uma temperatura:");
        temp1 = input.nextFloat();
        System.out.println("Qual a escala desta temperatura?");
        System.out.println("Digite 1 para Celsius");
        System.out.println("Digite 2 para Fahrenheit");
        System.out.println("Digite 3 para Kelvin");
        n2 = input.nextFloat();
        System.out.println("Para qual escala deseja converter?");
        if (n2 == 1){
            escala1 = "Celsius";
            System.out.println("Digite 1 para converter " + escala1 + " em Fahrenheit");
            System.out.println("Digite 2 para converter " + escala1 + " em Kelvin");
            opcao = input.nextInt();
            if (opcao == 1){
                resp = (temp1 * 9/5 ) + 32;
                escala2 = "Fahrenheit";
            }
            else{
                resp = temp1 + 273.15f;
                escala2 = "Kelvin";
            }
        }
        else if(n2 == 2){
            escala1 = "Fahrenheit";
            System.out.println("Digite 1 para converter " + escala1 + " em Celsius");
            System.out.println("Digite 2 para converter " + escala1 + " em Kelvin");
            opcao = input.nextInt();
            if (opcao == 1){
                resp = (temp1 - 32) * 5/9;
                escala2 = "Celsius";
            }
            else{
                resp = (temp1 - 32) * 5/9 + 273.15f;
                escala2 = "Kelvin";
            }
        }
        else if(n2 == 3){
            escala1 = "Kelvin";
            System.out.println("Digite 1 para converter " + escala1 + " em Celsius");
            System.out.println("Digite 2 para converter " + escala1 + " em Fahrenheit");
            opcao = input.nextInt();
            if (opcao == 1){
                resp = temp1 - 273.15f;
                escala2 = "Celsius";
            }
            else{
                resp = (temp1 - 273.15f) * 9/5 + 32;
                escala2 = "Fahrenheit";
            }
        }

        System.out.println(temp1 + "° " + escala1 + " convertido em " + escala2 + " é igual a " + resp + "°.");
        
        /*
        //---------------- QUESTÃO 9 ------------------------------------------------------------------------------
        System.out.println("Informe o primeiro número:");
        n1 = input.nextFloat();
        System.out.println("Informe o segundo número:");
        n2 = input.nextFloat();
        System.out.println("Agora informe a operação que deseja realizar:");
        System.out.println("Digite 1 para SOMAR;");
        System.out.println("Digite 2 para SUBTRAIR;");
        System.out.println("Digite 3 para MULTIPLICAR;");
        System.out.println("Digite 4 para DIVIDIR:");
        int opera = 0;
        String operac = "";
        resp = 0;
        opera = input.nextInt();
        if (opera == 1){
            resp = n1 + n2;
            operac = "MAIS";
        }
        else if(opera == 2){
            resp = n1 - n2;
            operac = "MENOS";
        }
        else if(opera == 3){
            resp = n1 * n2;
            operac = "VEZES";
        }
        else if(opera == 4){
            if (n2 != 0){
                resp = n1 / n2;
                operac = "DIVIDIDO";
            }
            else{
                System.out.println("Em uma divisão o denominador não pode ser igual a zero!");
            }
        }

        if (n2 != 0 && opera != 4){
            if (opera == 4){
                System.out.println(n1 + " " + operac + " por " + n2 +" é igual a " + resp);

            }
            else{
                System.out.println(n1 + " " + operac + " " + n2 +" é igual a " + resp);
            }
        }*/
        
        input.close();
    }
}