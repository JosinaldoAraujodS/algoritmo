import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// pode colocar o retorno em mais de um lugar na função - simula um BREAK para por exemplo sair de um loop antes de ler tudo
// usar arraylist como variavel global
// fazer as operações nas funções
public class Prova2 {

    public static void linha() {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }

    // verificar se o id do aluno já existe, se sim, retornar o index do id
    public static int idCheck(ArrayList<Integer> lista, int id) {
        int rtn_id = -1;
        for (int i = 0; i < lista.size(); i++) {
            if (id == lista.get(i)) {
                rtn_id = i;
            }
        }
        return rtn_id;
    }

    // CRIAR FUNÇÃO PARA MOSTRAR OS ARRAYS DE FORMA INTUITIVA
    public static void printArray(ArrayList<Integer> l_id, ArrayList<String> l_nome, ArrayList<Float> l_nt1,
            ArrayList<Float> l_nt2, ArrayList<Integer> l_falta, int all) {
        if (all == 0) {

        }
    }
    // //pegar o index do nome de um aluno - FUNÇÃO DESENECESSÁRIA
    // public static int namecheck(ArrayList<String> lista, String nome) {
    // int rtn_nm = -1;
    // for(int i = 0; i < lista.size();i++){
    // if (lista.get(i).equals(nome)){
    // rtn_nm = i;
    // }
    // }
    // return rtn_nm;
    // }

    public static void main(String[] args) {

        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int opcao = 0, i, nv_id, rtn_id, falta, rtn_index, id;
        float nt;
        String nome, sim_nao;
        ArrayList<Integer> faltas = new ArrayList<Integer>();
        ArrayList<Float> notas1 = new ArrayList<Float>();
        ArrayList<Float> notas2 = new ArrayList<Float>();
        ArrayList<Integer> ids = new ArrayList<Integer>();
        ArrayList<String> alunos = new ArrayList<String>();
        alunos.add("Daniel");
        alunos.add("Flávio");
        alunos.add("Felipe");
        alunos.add("João");
        alunos.add("José");
        alunos.add("Josinaldo");
        alunos.add("Maria");
        alunos.add("Laís");
        alunos.add("Leônidas");
        alunos.add("Lucas");
        alunos.add("Kauan");
        alunos.add("Ruberty");
        alunos.add("Tales");
        alunos.add("Vinícios");
        alunos.add("Walisson");

        // gerar notas e faltas
        for (i = 0; i < alunos.size(); i++) {
            notas1.add(random.nextFloat(10));
            notas2.add(random.nextFloat(10));
            faltas.add(random.nextInt(5));
            ids.add(i + 1);
        }

        while (opcao != 999) {
            linha();
            System.out.println("                MENU INICIAL");
            System.out.println("--------------------------------------------------");
            System.out.println("Informe o que deseja fazer:");
            System.out.println("Digite 1 para adicionar um novo aluno;");
            System.out.println("Digite 2 para visualizar um aluno;");
            System.out.println("Digite 3 para editar as informações de um aluno;");
            System.out.println("Digite 4 para remover um aluno;");
            System.out.println("Digite 5 para visualizar todos os alunos;");
            System.out.println("Digite 6 para ir até o menu das notas;");
            System.out.println("Digite 999 para sair:");
            linha();

            opcao = input.nextInt();

            while ((opcao > 6 || opcao < 1) && opcao != 999) {
                linha();
                System.out.println("Opção inválida!");
                System.out.print("Escolha um número entre 1 e 6, ou 999 para sair: ");
                opcao = input.nextInt();
            }
            linha();
            if (opcao == 1) {
                System.out.print("Informe o nome do novo aluno: ");
                nome = input.next();
                System.out.print("Agora informe o id do novo aluno: ");
                nv_id = input.nextInt();
                while (idCheck(ids, nv_id) != -1) {
                    rtn_id = idCheck(ids, nv_id);
                    linha();
                    System.out
                            .println("O id de número " + nv_id + " já existe para o aluno " + alunos.get(rtn_id));
                    System.out.println("Informe o número de id diferente! ");
                    nv_id = input.nextInt();
                }
                alunos.add(nome);
                ids.add(nv_id);
                linha();
                System.out.print("Deseja informar as notas e faltas de " + nome + " [s/n]? ");
                sim_nao = input.next();
                while ((sim_nao.equals("s")) == false && (sim_nao.equals("n") == false)) {
                    System.out.print("Digite 's' para SIM ou 'n' para NÃO: ");
                    sim_nao = input.next();
                }

                if (sim_nao.equals("s")) {
                    System.out.print("Informe a nota da primeira prova: ");
                    nt = input.nextFloat();
                    notas1.add(nt);
                    System.out.print("Informe a nota da segunda prova: ");
                    nt = input.nextFloat();
                    notas2.add(nt);
                    System.out.print("Informe a quantidade de faltas de " + nome + ": ");
                    falta = input.nextInt();
                    faltas.add(falta);
                } else {
                    notas1.add(null);
                    notas2.add(null);
                    faltas.add(null);
                }
            } else if (opcao == 2) {
                System.out.print("Informe o id do aluno que deseja visualizar: ");
                id = input.nextInt();
                while (idCheck(ids, id) == -1) {
                    System.out.println("O id informado não existe! Informe um id válido para continuar!");
                    System.out.print("Informe o id do aluno que deseja visualizar: ");
                    id = input.nextInt();
                }
                rtn_index = idCheck(ids, id);

                System.out.println(ids.get(rtn_index));
                System.out.println(alunos.get(rtn_index));
                System.out.println(notas1.get(rtn_index));
                System.out.println(notas2.get(rtn_index));
                System.out.println(faltas.get(rtn_index));
            } else if (opcao == 3) {
                System.out.println("Informe o id do aluno que deseja editar: ");
                id = input.nextInt();
                while (idCheck(ids, id) == -1) {
                    System.out.println("O id informado não existe! Informe um id válido para continuar!");
                    System.out.print("Informe o id do aluno que deseja visualizar: ");
                    id = input.nextInt();
                }
                rtn_index = idCheck(ids, id);

                System.out.println("Deseja editar o nome de " + alunos.get(rtn_index) + "? [s/n]: ");
                sim_nao = input.next();
                while ((sim_nao.equals("s")) == false && (sim_nao.equals("n") == false)) {
                    System.out.print("Digite 's' para SIM ou 'n' para NÃO: ");
                    sim_nao = input.next();
                }
                if (sim_nao.equals("s")) {
                    System.out.println("Informe o novo nome do aluno: ");
                    alunos.set(rtn_index, input.next());
                }
                System.out.println("Deseja editar as notas de " + alunos.get(rtn_index) + "? [s/n]: ");
                sim_nao = input.next();
                while ((sim_nao.equals("s")) == false && (sim_nao.equals("n") == false)) {
                    System.out.print("Digite 's' para SIM ou 'n' para NÃO: ");
                    sim_nao = input.next();
                }
                if (sim_nao.equals("s")) {
                    System.out.println("Informe a nota primeira prova: ");
                    notas1.set(rtn_index, input.nextFloat());
                    System.out.println("Informe a nota segunda prova: ");
                    notas2.set(rtn_index, input.nextFloat());
                }
                System.out.println("Deseja editar a quantidade de faltas de " + alunos.get(rtn_index) + "? [s/n]: ");
                sim_nao = input.next();
                while ((sim_nao.equals("s")) == false && (sim_nao.equals("n") == false)) {
                    System.out.print("Digite 's' para SIM ou 'n' para NÃO: ");
                    sim_nao = input.next();
                }
                if (sim_nao.equals("s")) {
                    System.out.println("Informe a quantidade de faltas de " + alunos.get(rtn_index) + ": ");
                    faltas.set(rtn_index, input.nextInt());
                }
                linha();
            } else if (opcao == 4) {
                System.out.println("Informe o id do aluno que deseja remover: ");
                id = input.nextInt();
                while (idCheck(ids, id) == -1) {
                    System.out.println("O id informado não existe! Informe um id válido para continuar!");
                    System.out.print("Informe o id do aluno que deseja visualizar: ");
                    id = input.nextInt();
                }
                rtn_index = idCheck(ids, id);
                System.out.println("Deseja remover todas as informações de " + alunos.get(rtn_index) + "? [s/n]: ");
                sim_nao = input.next();
                while ((sim_nao.equals("s")) == false && (sim_nao.equals("n") == false)) {
                    System.out.print("Digite 's' para SIM ou 'n' para NÃO: ");
                    sim_nao = input.next();
                }
                if (sim_nao.equals("s")) {
                    System.out.println("Informações deletadas!");
                } else if (sim_nao.equals("n")) {
                    System.out.println(
                            "Operação abortada! As informações de " + alunos.get(rtn_index) + " não foram deletadas!");
                }
            } else if (opcao == 5) {
                for (i = 0; i < alunos.size(); i++) {
                    System.out.println("id: " + ids.get(i) + " - " + alunos.get(i) + "|Nota1: " + notas1.get(i) + "|Nota2: " + notas2.get(i) + "|Faltas: " + faltas.get(i));
                }
            } else if (opcao == 999) {
                System.out.println("Fim da Sessão...");
                System.out.println("Volte Sempre!");
            }
        }
        input.close();
    }
}

// System.out.println(alunos);
// System.out.println(notas1);
// System.out.println(notas2);
// System.out.println(faltas);
