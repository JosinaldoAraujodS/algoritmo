import java.util.Scanner;

public class Atvdd {
    public static void main(String[] args) {
        
        System.out.println("-*-*-*-* Programa 12 Casas *-*-*-*-");

        Scanner input = new Scanner(System.in);

        //DECLARAÇÃO DE VARIÁVEIS
        String nm;
        String dia;
        String mes;
        float alt;
        float peso;
        String sx;
        float imc;
        String ttlo;
        String signo;
        int mesdia;

        System.out.println("Escreva seu nome:");
        nm = input.nextLine();
        System.out.println("Informe o dia de nascimento:");
        dia = input.nextLine();
        System.out.println("Informe o mês de nascimento:");
        mes = input.nextLine();
        System.out.println("Informe a altura:");
        alt = input.nextFloat();
        System.out.println("Informe o peso:");
        peso = input.nextFloat();
        System.out.println("Informe seu sexo:");
        sx = input.next();

        signo="";
        mesdia = Integer.parseInt(mes + dia);

        if (mesdia>=321 && mesdia<=420){
            signo = "Áries";
        }
        else if(mesdia>=421 && mesdia <= 520){
            signo = "Touro";
        }
        else if(mesdia>=521 && mesdia <= 620){
            signo = "Gêmeos";
        }
        else if(mesdia>=621 && mesdia <= 722){
            signo = "Câncer";
        }
        else if(mesdia>=723 && mesdia <= 822){
            signo = "Leão";
        }
        else if(mesdia>=823 && mesdia <= 922){
            signo = "Virgem";
        }
        else if(mesdia>=923 && mesdia <= 1022){
            signo = "Libra";
        }
        else if(mesdia>=1023 && mesdia <= 1121){
            signo = "Escorpião";
        }
        else if(mesdia>=1122 && mesdia <= 1221){
            signo = "Sagitário";
        }
        else if(mesdia>=1222 || mesdia <= 120){
            signo = "Capricórnio";
        }
        else if(mesdia>=121 && mesdia <= 219){
            signo = "Aquário";
        }
        else if(mesdia>=220 && mesdia <= 320){
            signo = "Peixes";
        }

        imc = peso/(alt*alt);
        System.out.println("Seu IMC é: " + imc);

        if (sx.equals("m")){
            ttlo = "Cavaleiro";
        }
        else if (sx.equals("f")){
            ttlo = "Amazona";
        }
        else{
            ttlo = "Error";
        }

        if (imc > 18.5 && imc < 24.9){
            System.out.println(nm + ", " + ttlo + " de " + signo);
        }
        else{
            System.out.println(nm + ", vc não está apto para ser um " + ttlo + " de " + signo + "!");
        }

        input.close();
    }
}
