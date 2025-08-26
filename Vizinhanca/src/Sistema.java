import java.util.ArrayList;
import java.util.List;
import java.util.PrimitiveIterator;
import java.util.Scanner;

public class Sistema {
    private Scanner scanner;
    private Solicitante solicitante;
    private Voluntario voluntario;
    private List<Solicitante> solicitantes;
    private List<Voluntario> voluntarios;

    public Sistema(){
        this.solicitantes = new ArrayList<>();
        this.voluntarios = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void executar(){
        int opcao;
        do {
            System.out.println("""
                \n
                Digite o número da opção desejada: 
                1 - Cadastro solicitante:
                2 - Pesquisa solicitante:
                3 - Cadastrar voluntário:
                4 - Pesquisa voluntário
                5 - Pesquisa por gênero:
                0 - Sair:
                """);
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao){
                case 1 -> cadastrarSolicitante();
                case 2 -> pesquisaSolicitante();
                /*case 3;
                case 4;
                case 5;*/
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida, tente novamente! ");
            }

        } while (opcao!= 0);
    }

    private void cadastrarSolicitante(){
        System.out.println("Digite o nome do Solicitante: ");
        String nomeEmpr = scanner.nextLine();

        System.out.println("Digite o seu CPF/CNPJ");
        int cpfCnpj = scanner.nextInt();

        solicitantes.add(solicitante);
    }

    private void pesquisaSolicitante(){
        if (solicitantes.isEmpty()){
            System.out.println("Não existe solicitantes cadastrados");
        }else {
            System.out.println("\nLista de solicitantes cadastrados");
        }
    }

    private void cadastrarVoluntario(){
        System.out.println("Digite o nome do voluntário: ");
        String nome = scanner.nextLine();
    }


}
