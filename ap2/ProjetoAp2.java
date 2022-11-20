
/*usar funções de outros arquivos;
  criar variáveis globais;
  ler tamanho da matriz para fazer loop dinâmico;
  conseguir usar a função listMaior;
  retorno de funções;
  adicionar parâmetros opcionais para reduzir a quantidade de funções parecidas - se tal parametro for informado vai executar algo a mais que tenha naquela função
USAR COM OFUNÇÃO UTILIZANDO O RETORNO
                  while (opcao > alunos.size() && opcao != 999) {
                    System.out.println("Ao todo são " + (alunos.size()) + " alunos.");
                    System.out.print("Informe um número entre 1 e " + (alunos.size()) + ": ");
                    opcao = input.nextInt();
                }
*/
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Crud {

    public static void lin() {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }

    public static void lerArr(ArrayList<String> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println((i + 1) + " - " + lista.get(i));
        }
        lin();
    }

    public static void ler2Arr(ArrayList<String> listaNm, ArrayList<Integer> listaNt) {
        for (int i = 0; i < listaNm.size(); i++) {
            System.out.println((i + 1) + " - " + listaNm.get(i) + " |Nota: " + listaNt.get(i));
        }
        lin();
    }

    // ADICIONAR RETORNO PARA USAR A FUNÇÃO SER ÚTIL
    public static void listMaior(int opc, ArrayList<String> lista) {
        Scanner input = new Scanner(System.in);
        while (opc > lista.size()) {
            System.out.println("Ao todo são " + (lista.size()) + " alunos.");
            System.out.print("Informe um número entre 1 e " + (lista.size()) + ": ");
            opc = input.nextInt();
        }
        input.close();
    }

    public static void opcoes() {
        System.out.println("                MENU INICIAL");
        System.out.println("-------------------------------------------------");
        System.out.println("Informe o que deseja fazer:");
        System.out.println("Digite 1 para adicionar um novo aluno;");
        System.out.println("Digite 2 para visualizar um aluno;");
        System.out.println("Digite 3 para editar o nome de um aluno;");
        System.out.println("Digite 4 para remover um aluno;");
        System.out.println("Digite 5 para ir até o menu das notas;");
        System.out.println("Digite 999 para sair:");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }

    public static void opcoesNotas() {
        System.out.println("                MENU DAS NOTAS");
        System.out.println("-------------------------------------------------");
        System.out.println("Informe o que deseja fazer:");
        System.out.println("Digite 1 para visualizar as notas dos alunos;");
        System.out.println("Digite 2 para editar a nota de um aluno;");
        System.out.println("Digite 3 para visualizar os alunos aprovados;");
        System.out.println("Digite 4 para visualizar os alunos reprovados;");
        System.out.println("Digite 5 para voltar até o menu inicial;");
        System.out.println("Digite 999 para sair:");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }

    public static void aprovados(ArrayList<String> listaNm, ArrayList<Integer> listaNt) {
        System.out.println("Lista dos alunos aprovados e suas respectivas notas:");
        for (int i = 0; i < listaNm.size(); i++) {
            if (listaNt.get(i) >= 6) {
                System.out.println((i + 1) + " - " + listaNm.get(i) + " |Nota: " + listaNt.get(i));
            }
        }
        lin();
    }

    public static void reprovados(ArrayList<String> listaNm, ArrayList<Integer> listaNt) {
        System.out.println("Lista dos alunos reprovados e suas respectivas notas:");
        for (int i = 0; i < listaNm.size(); i++) {
            if (listaNt.get(i) < 6) {
                System.out.println((i + 1) + " - " + listaNm.get(i) + " |Nota: " + listaNt.get(i));
            }
        }
        lin();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random randon = new Random();
        int i, opcao;
        ArrayList<String> alunos = new ArrayList<String>();
        ArrayList<Integer> notas = new ArrayList<Integer>();

        for (i = 0; i < 5; i++) {
            alunos.add("Aluno_" + (i + 1));
            notas.add(randon.nextInt(11));
        }

        lin();
        System.out.println("Lista dos alunos:");
        lerArr(alunos);
        opcoes();
        opcao = input.nextInt();

        while (opcao != 999) {
            while ((opcao > 5 || opcao < 1) && opcao != 999) {
                System.out.println("Opção inválida!");
                System.out.print("Escolha um número entre 1 e 4: ");
                opcao = input.nextInt();
            }

            if (opcao == 1) {
                System.out.print("Informe o nome do aluno que deseja adicionar: ");
                alunos.add(input.next());
                System.out.print("Informe a nota do novo aluno: ");
                notas.add(input.nextInt());
                lin();
                System.out.println("Lista atualizada:");
                lerArr(alunos);
            } else if (opcao == 2) {
                System.out.print("Informe o número do aluno que deseja visualizar: ");
                opcao = input.nextInt();
                while (opcao > alunos.size() && opcao != 999) {
                    System.out.println("Ao todo são " + (alunos.size()) + " alunos.");
                    System.out.print("Informe um número entre 1 e " + (alunos.size()) + ": ");
                    opcao = input.nextInt();
                }
                System.out.println("Este é o aluno selecionado: " + alunos.get(opcao - 1));
            } else if (opcao == 3) {
                String novoAluno;
                System.out.print("Informe o número do aluno que deseja editar: ");
                opcao = input.nextInt();
                while (opcao > alunos.size() && opcao != 999) {
                    System.out.println("Ao todo são " + (alunos.size()) + " alunos.");
                    System.out.print("Informe um número entre 1 e " + (alunos.size()) + ": ");
                    opcao = input.nextInt();
                }
                System.out.println("Aluno editado: " + alunos.get(opcao - 1));
                System.out.print("Informe o novo nome para o aluno: ");
                novoAluno = input.next();
                alunos.set(opcao - 1, novoAluno);
                lin();
                System.out.println("Lista atualizada:");
                lerArr(alunos);
            } else if (opcao == 4) {
                System.out.print("Informe o número do aluno que deseja remover: ");
                opcao = input.nextInt();
                while (opcao > alunos.size() && opcao != 999) {
                    System.out.println("Ao todo são " + (alunos.size()) + " alunos.");
                    System.out.print("Informe um número entre 1 e " + (alunos.size()) + ": ");
                    opcao = input.nextInt();
                }
                System.out.println("Aluno removido: " + alunos.get(opcao - 1));
                alunos.remove(opcao - 1);
                notas.remove(opcao - 1);
                lin();
                System.out.println("Lista atualizada:");
                lerArr(alunos);
            } else if (opcao == 5) {

                lin();
                opcoesNotas();
                opcao = input.nextInt();
                // while (opcao != 999 && opcao != 5) {
                if (opcao == 1) {
                    ler2Arr(alunos, notas);
                } else if (opcao == 2) {
                    int novaNota;
                    System.out.print("Informe o número do aluno que deseja editar a nota: ");
                    opcao = input.nextInt();
                    while (opcao > alunos.size() && opcao != 999) {
                        System.out.println("Ao todo são " + (alunos.size()) + " alunos.");
                        System.out.print("Informe um número entre 1 e " + (alunos.size()) + ": ");
                        opcao = input.nextInt();
                    }
                    System.out.println("Nota antiga do " + alunos.get(opcao - 1) + " = " + notas.get(opcao - 1));
                    System.out.print("Informe a nova nota para o aluno (número inteiro): ");
                    novaNota = input.nextInt();
                    notas.set(opcao - 1, novaNota);
                    lin();
                    System.out.println("Nova nota do " + alunos.get(opcao - 1) + " = " + notas.get(opcao - 1));
                } else if (opcao == 3) {
                    aprovados(alunos, notas);
                } else if (opcao == 4) {
                    reprovados(alunos, notas);
                }
                lin();
                opcoesNotas();
                opcao = input.nextInt();
                lin();
                // }
            }

            if (opcao != 999) {
                opcoes();
                opcao = input.nextInt();
            }
        }
        lin();
        System.out.println("Sessão Encerrada...\nVolte Sempre!");
        lin();
        input.close();
    }
}
